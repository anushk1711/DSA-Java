import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;

/** Produces dark-theme, syntax-coloured PDFs from the student's Java practice. */
public class GenerateColoredPlacementPdfs {
    private static final Path ROOT = Paths.get(".").toAbsolutePath().normalize();
    private static final Path OUTPUT = ROOT.resolve("Placement-Practice-PDFs").resolve("colored");
    private static final Set<String> KEYWORDS = Set.of("abstract", "assert", "break", "case", "catch", "class", "continue", "default", "do", "else", "enum", "extends", "final", "finally", "for", "if", "implements", "import", "instanceof", "interface", "new", "package", "private", "protected", "public", "return", "static", "super", "switch", "this", "throw", "throws", "try", "void", "while");
    private static final Set<String> TYPES = Set.of("String", "Integer", "Character", "Boolean", "Scanner", "Arrays", "Collections", "Math", "System", "HashMap", "HashSet", "ArrayList", "List", "Map", "Set", "PriorityQueue", "JFrame", "JLabel", "JToggleButton", "IOException");

    private enum Kind { TITLE, SUBTITLE, META, RULE, CODE, BLANK }
    private record Line(String text, Kind kind) {}
    private record Token(String text, String color, boolean bold) {}

    public static void main(String[] args) throws IOException {
        Files.createDirectories(OUTPUT);
        List<Path> sources = Files.walk(ROOT)
                .filter(path -> path.toString().endsWith(".java"))
                .filter(path -> !path.startsWith(ROOT.resolve("tools")))
                .filter(path -> !path.getFileName().toString().equals("tempCodeRunnerFile.java"))
                .sorted(Comparator.comparing(path -> ROOT.relativize(path).toString()))
                .collect(Collectors.toList());
        createPdf("Basic Java & DSA Practice", "basic", sources);
        createPdf("Intermediate Java & DSA Practice", "intermediate", sources);
        createPdf("Medium-Level Placement Practice", "medium", sources);
        System.out.println("Created coloured PDFs in: " + OUTPUT);
    }

    private static void createPdf(String heading, String level, List<Path> allSources) throws IOException {
        List<Path> sources = allSources.stream().filter(path -> levelFor(path).equals(level)).collect(Collectors.toList());
        List<Line> lines = new ArrayList<>();
        lines.add(new Line(heading, Kind.TITLE));
        lines.add(new Line("Placement preparation portfolio | VS Code-style Java syntax colouring", Kind.SUBTITLE));
        lines.add(new Line("Problems included: " + sources.size() + " | Your original code is shown without edits.", Kind.META));
        lines.add(new Line("Colour key: keywords blue, types teal, strings orange, comments green, numbers light green.", Kind.META));
        lines.add(new Line("", Kind.BLANK));

        for (Path source : sources) {
            String code = Files.readString(source, StandardCharsets.UTF_8);
            String relative = ROOT.relativize(source).toString().replace('\\', '/');
            lines.add(new Line(repeat('=', 104), Kind.RULE));
            lines.add(new Line("Problem: " + title(source.getFileName().toString().replaceFirst("\\.java$", "")), Kind.SUBTITLE));
            lines.add(new Line("Level: " + capitalize(level) + " | Source: " + relative, Kind.META));
            lines.add(new Line("Time: " + timeComplexity(code) + " | Space: " + spaceComplexity(code), Kind.META));
            lines.add(new Line("", Kind.BLANK));
            for (String codeLine : code.replace("\r\n", "\n").replace('\r', '\n').split("\n", -1)) {
                for (String part : wrapCode(codeLine, 104)) lines.add(new Line(part, Kind.CODE));
            }
            lines.add(new Line("", Kind.BLANK));
        }
        writePdf(OUTPUT.resolve(level + "-placement-practice-colored.pdf"), lines);
    }

    private static String levelFor(Path path) {
        String relative = ROOT.relativize(path).toString().replace('\\', '/').toLowerCase(Locale.ROOT);
        if (relative.startsWith("zoho/pattern/")) return "basic";
        if (relative.startsWith("digital/search_problems/")) return "intermediate";
        if (relative.startsWith("digital/") || relative.startsWith("hashmap/") || relative.startsWith("heap/") || relative.startsWith("zoho/arraylist/") || relative.startsWith("zoho/")) return "medium";
        if (relative.startsWith("arrays/") || relative.startsWith("strings/") || relative.startsWith("tcs/") || relative.startsWith("skillrack/") || relative.startsWith("avg problems/")) return "intermediate";
        return "basic";
    }

    private static String title(String name) { return name.replace('_', ' ').replaceAll("([a-z])([A-Z])", "$1 $2").replaceAll("\\s+", " ").trim(); }
    private static String timeComplexity(String code) {
        if (code.contains("PriorityQueue")) return "O(n log k) common heap approach";
        if (code.contains("Arrays.sort") || code.contains("Collections.sort")) return "O(n log n)";
        if (code.matches("(?s).*while\\s*\\(\\s*low\\s*<=\\s*high.*")) return "O(log n)";
        if (code.contains("HashMap") || code.contains("HashSet")) return "O(n) average case";
        if (code.matches("(?s).*for\\s*\\([^)]*\\)\\s*\\{?\\s*for\\s*\\(.*")) return "O(n²)";
        if (code.contains("for(") || code.contains("for (") || code.contains("while(")) return "O(n)";
        return "O(1)";
    }
    private static String spaceComplexity(String code) { return (code.contains("HashMap") || code.contains("HashSet") || code.contains("PriorityQueue") || code.contains("new int[") || code.contains("new String[")) ? "O(n)" : "O(1) auxiliary"; }
    private static List<String> wrapCode(String line, int width) {
        List<String> result = new ArrayList<>();
        if (line.isEmpty()) { result.add(""); return result; }
        String remaining = line.replace('\t', ' ');
        while (remaining.length() > width) {
            int cut = remaining.lastIndexOf(' ', width); if (cut < 1) cut = width;
            result.add(remaining.substring(0, cut)); remaining = "    " + remaining.substring(cut).stripLeading();
        }
        result.add(remaining); return result;
    }

    private static void writePdf(Path destination, List<Line> lines) throws IOException {
        final int linesPerPage = 72;
        List<List<Line>> pages = new ArrayList<>();
        for (int start = 0; start < lines.size(); start += linesPerPage) pages.add(lines.subList(start, Math.min(start + linesPerPage, lines.size())));
        List<byte[]> streams = new ArrayList<>();
        for (int page = 0; page < pages.size(); page++) streams.add(pageStream(pages.get(page), page + 1, pages.size()).getBytes(StandardCharsets.ISO_8859_1));

        ByteArrayOutputStream pdf = new ByteArrayOutputStream(); List<Integer> offsets = new ArrayList<>(); offsets.add(0);
        pdf.write("%PDF-1.4\n%\u00e2\u00e3\u00cf\u00d3\n".getBytes(StandardCharsets.ISO_8859_1));
        object(pdf, offsets, 1, "<< /Type /Catalog /Pages 2 0 R >>");
        StringBuilder kids = new StringBuilder(); for (int i = 0; i < pages.size(); i++) kids.append(5 + i * 2).append(" 0 R ");
        object(pdf, offsets, 2, "<< /Type /Pages /Kids [ " + kids + "] /Count " + pages.size() + " >>");
        object(pdf, offsets, 3, "<< /Type /Font /Subtype /Type1 /BaseFont /Courier >>");
        object(pdf, offsets, 4, "<< /Type /Font /Subtype /Type1 /BaseFont /Courier-Bold >>");
        for (int i = 0; i < pages.size(); i++) {
            int pageObject = 5 + i * 2, contentObject = pageObject + 1;
            object(pdf, offsets, pageObject, "<< /Type /Page /Parent 2 0 R /MediaBox [0 0 595 842] /Resources << /Font << /F1 3 0 R /F2 4 0 R >> >> /Contents " + contentObject + " 0 R >>");
            streamObject(pdf, offsets, contentObject, streams.get(i));
        }
        int xref = pdf.size(); pdf.write(("xref\n0 " + offsets.size() + "\n0000000000 65535 f \n").getBytes(StandardCharsets.ISO_8859_1));
        for (int i = 1; i < offsets.size(); i++) pdf.write(String.format("%010d 00000 n \n", offsets.get(i)).getBytes(StandardCharsets.ISO_8859_1));
        pdf.write(("trailer\n<< /Size " + offsets.size() + " /Root 1 0 R >>\nstartxref\n" + xref + "\n%%EOF\n").getBytes(StandardCharsets.ISO_8859_1));
        Files.write(destination, pdf.toByteArray());
    }

    private static String pageStream(List<Line> lines, int pageNumber, int totalPages) {
        StringBuilder output = new StringBuilder("0.118 0.118 0.118 rg\n0 0 595 842 re f\nBT\n36 806 Td\n10 TL\n");
        appendPlain(output, "Page " + pageNumber + " of " + totalPages, "0.45 0.45 0.45", false); output.append("T*\n");
        boolean[] blockComment = { false };
        for (Line line : lines) { appendLine(output, line, blockComment); output.append("T*\n"); }
        return output.append("ET\n").toString();
    }

    private static void appendLine(StringBuilder output, Line line, boolean[] blockComment) {
        switch (line.kind()) {
            case TITLE -> appendPlain(output, line.text(), "0.31 0.62 0.98", true);
            case SUBTITLE -> appendPlain(output, line.text(), "0.78 0.86 1.00", true);
            case META -> appendPlain(output, line.text(), "0.66 0.72 0.80", false);
            case RULE -> appendPlain(output, line.text(), "0.25 0.39 0.56", false);
            case CODE -> { for (Token token : highlight(line.text(), blockComment)) appendPlain(output, token.text(), token.color(), token.bold()); }
            case BLANK -> { }
        }
    }

    private static List<Token> highlight(String line, boolean[] blockComment) {
        List<Token> tokens = new ArrayList<>(); int i = 0;
        while (i < line.length()) {
            if (blockComment[0]) { int end = line.indexOf("*/", i); if (end < 0) { tokens.add(new Token(line.substring(i), "0.42 0.75 0.48", false)); break; } tokens.add(new Token(line.substring(i, end + 2), "0.42 0.75 0.48", false)); i = end + 2; blockComment[0] = false; continue; }
            if (line.startsWith("//", i)) { tokens.add(new Token(line.substring(i), "0.42 0.75 0.48", false)); break; }
            if (line.startsWith("/*", i)) { int end = line.indexOf("*/", i + 2); if (end < 0) { tokens.add(new Token(line.substring(i), "0.42 0.75 0.48", false)); blockComment[0] = true; break; } tokens.add(new Token(line.substring(i, end + 2), "0.42 0.75 0.48", false)); i = end + 2; continue; }
            char c = line.charAt(i);
            if (c == '"' || c == '\'') { int end = i + 1; while (end < line.length()) { if (line.charAt(end) == '\\') { end += 2; continue; } if (line.charAt(end) == c) { end++; break; } end++; } tokens.add(new Token(line.substring(i, Math.min(end, line.length())), "0.93 0.67 0.42", false)); i = Math.min(end, line.length()); continue; }
            if (Character.isJavaIdentifierStart(c)) { int end = i + 1; while (end < line.length() && Character.isJavaIdentifierPart(line.charAt(end))) end++; String word = line.substring(i, end); if (KEYWORDS.contains(word)) tokens.add(new Token(word, "0.34 0.64 0.98", true)); else if (TYPES.contains(word)) tokens.add(new Token(word, "0.31 0.80 0.75", false)); else if (word.equals("true") || word.equals("false") || word.equals("null")) tokens.add(new Token(word, "0.70 0.56 0.98", true)); else tokens.add(new Token(word, "0.86 0.86 0.86", false)); i = end; continue; }
            if (Character.isDigit(c)) { int end = i + 1; while (end < line.length() && (Character.isDigit(line.charAt(end)) || line.charAt(end) == '.')) end++; tokens.add(new Token(line.substring(i, end), "0.72 0.84 0.55", false)); i = end; continue; }
            tokens.add(new Token(String.valueOf(c), "0.86 0.86 0.86", false)); i++;
        }
        return tokens;
    }

    private static void appendPlain(StringBuilder output, String text, String colour, boolean bold) { output.append(colour).append(" rg\n/").append(bold ? "F2" : "F1").append(" 8 Tf\n(").append(pdfText(text)).append(") Tj\n"); }
    private static void object(ByteArrayOutputStream pdf, List<Integer> offsets, int number, String value) throws IOException { offsets.add(pdf.size()); pdf.write((number + " 0 obj\n" + value + "\nendobj\n").getBytes(StandardCharsets.ISO_8859_1)); }
    private static void streamObject(ByteArrayOutputStream pdf, List<Integer> offsets, int number, byte[] stream) throws IOException { offsets.add(pdf.size()); pdf.write((number + " 0 obj\n<< /Length " + stream.length + " >>\nstream\n").getBytes(StandardCharsets.ISO_8859_1)); pdf.write(stream); pdf.write("endstream\nendobj\n".getBytes(StandardCharsets.ISO_8859_1)); }
    private static String pdfText(String text) { return text.replaceAll("[^\\x20-\\x7E]", "?").replace("\\", "\\\\").replace("(", "\\(").replace(")", "\\)"); }
    private static String repeat(char value, int count) { return String.valueOf(value).repeat(count); }
    private static String capitalize(String value) { return Character.toUpperCase(value.charAt(0)) + value.substring(1); }
}
