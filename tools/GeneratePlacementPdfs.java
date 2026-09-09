import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/** Creates three PDFs from the student's original Java practice files. */
public class GeneratePlacementPdfs {
    private static final Path ROOT = Paths.get(".").toAbsolutePath().normalize();
    private static final Path OUTPUT = ROOT.resolve("Placement-Practice-PDFs");

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
        System.out.println("Created PDFs in: " + OUTPUT);
    }

    private static void createPdf(String heading, String level, List<Path> allSources) throws IOException {
        List<Path> sources = allSources.stream()
                .filter(path -> levelFor(path).equals(level))
                .collect(Collectors.toList());
        List<String> lines = new ArrayList<>();
        lines.add(heading);
        lines.add("Placement preparation portfolio | Original practice code");
        lines.add("Problems included: " + sources.size());
        lines.add("Each entry includes its title, estimated complexity, source path, and original code.");
        lines.add("");

        for (Path source : sources) {
            String code = Files.readString(source, StandardCharsets.UTF_8);
            String relative = ROOT.relativize(source).toString().replace('\\', '/');
            lines.add(repeat('=', 104));
            lines.add("Problem: " + title(source.getFileName().toString().replaceFirst("\\.java$", "")));
            lines.add("Level: " + capitalize(level));
            lines.add("Source: " + relative);
            lines.add("Time complexity: " + timeComplexity(code));
            lines.add("Space complexity: " + spaceComplexity(code));
            lines.add("Your original code:");
            lines.add("");
            for (String line : code.replace("\r\n", "\n").replace('\r', '\n').split("\n", -1)) {
                lines.addAll(wrapCode(line, 104));
            }
            lines.add("");
        }

        writePdf(OUTPUT.resolve(level + "-placement-practice.pdf"), lines);
    }

    private static String levelFor(Path path) {
        String relative = ROOT.relativize(path).toString().replace('\\', '/').toLowerCase(Locale.ROOT);
        if (relative.startsWith("zoho/pattern/")) return "basic";
        if (relative.startsWith("digital/search_problems/")) return "intermediate";
        if (relative.startsWith("digital/") || relative.startsWith("hashmap/") ||
                relative.startsWith("heap/") || relative.startsWith("zoho/arraylist/") ||
                relative.startsWith("zoho/")) return "medium";
        if (relative.startsWith("arrays/") || relative.startsWith("strings/") ||
                relative.startsWith("tcs/") || relative.startsWith("skillrack/") ||
                relative.startsWith("avg problems/")) return "intermediate";
        return "basic";
    }

    private static String title(String name) {
        String readable = name.replace('_', ' ').replaceAll("([a-z])([A-Z])", "$1 $2");
        return readable.replaceAll("\\s+", " ").trim();
    }

    private static String timeComplexity(String code) {
        if (code.contains("PriorityQueue")) return "O(n log k) in the common Top-K/heap approach";
        if (code.contains("Arrays.sort") || code.contains("Collections.sort")) return "O(n log n)";
        if (code.matches("(?s).*while\\s*\\(\\s*low\\s*<=\\s*high.*")) return "O(log n)";
        if (code.contains("HashMap") || code.contains("HashSet")) return "O(n) average case";
        int loops = count(code, "for(") + count(code, "for (") + count(code, "while(") + count(code, "while (");
        if (loops >= 2 && code.matches("(?s).*for\\s*\\([^)]*\\)\\s*\\{?\\s*for\\s*\\(.*")) return "O(n²)";
        if (loops >= 1) return "O(n)";
        return "O(1)";
    }

    private static String spaceComplexity(String code) {
        if (code.contains("HashMap") || code.contains("HashSet") || code.contains("PriorityQueue") ||
                code.contains("new int[") || code.contains("new String[")) return "O(n)";
        return "O(1) auxiliary space";
    }

    private static int count(String text, String target) {
        int total = 0, from = 0;
        while ((from = text.indexOf(target, from)) >= 0) { total++; from += target.length(); }
        return total;
    }

    private static List<String> wrapCode(String line, int width) {
        List<String> result = new ArrayList<>();
        if (line.isEmpty()) { result.add(""); return result; }
        String remaining = line.replace('\t', ' ');
        while (remaining.length() > width) {
            int breakAt = remaining.lastIndexOf(' ', width);
            if (breakAt < 1) breakAt = width;
            result.add(remaining.substring(0, breakAt));
            remaining = "    " + remaining.substring(breakAt).stripLeading();
        }
        result.add(remaining);
        return result;
    }

    private static void writePdf(Path destination, List<String> sourceLines) throws IOException {
        final int linesPerPage = 72;
        List<List<String>> pages = new ArrayList<>();
        for (int start = 0; start < sourceLines.size(); start += linesPerPage) {
            pages.add(sourceLines.subList(start, Math.min(start + linesPerPage, sourceLines.size())));
        }
        List<byte[]> streams = new ArrayList<>();
        for (int page = 0; page < pages.size(); page++) {
            StringBuilder stream = new StringBuilder("BT\n/F1 8 Tf\n36 806 Td\n10 TL\n");
            stream.append("(Page ").append(page + 1).append(" of ").append(pages.size()).append(") Tj\nT*\n");
            for (String line : pages.get(page)) stream.append('(').append(pdfText(line)).append(") Tj\nT*\n");
            stream.append("ET\n");
            streams.add(stream.toString().getBytes(StandardCharsets.ISO_8859_1));
        }

        ByteArrayOutputStream pdf = new ByteArrayOutputStream();
        List<Integer> offsets = new ArrayList<>();
        pdf.write("%PDF-1.4\n%\u00e2\u00e3\u00cf\u00d3\n".getBytes(StandardCharsets.ISO_8859_1));
        offsets.add(0);
        object(pdf, offsets, 1, "<< /Type /Catalog /Pages 2 0 R >>");
        StringBuilder kids = new StringBuilder();
        for (int i = 0; i < pages.size(); i++) kids.append(4 + i * 2).append(" 0 R ");
        object(pdf, offsets, 2, "<< /Type /Pages /Kids [ " + kids + "] /Count " + pages.size() + " >>");
        object(pdf, offsets, 3, "<< /Type /Font /Subtype /Type1 /BaseFont /Courier >>");
        for (int i = 0; i < pages.size(); i++) {
            int pageObject = 4 + i * 2;
            int contentObject = pageObject + 1;
            object(pdf, offsets, pageObject, "<< /Type /Page /Parent 2 0 R /MediaBox [0 0 595 842] /Resources << /Font << /F1 3 0 R >> >> /Contents " + contentObject + " 0 R >>");
            streamObject(pdf, offsets, contentObject, streams.get(i));
        }
        int xref = pdf.size();
        pdf.write(("xref\n0 " + offsets.size() + "\n0000000000 65535 f \n").getBytes(StandardCharsets.ISO_8859_1));
        for (int i = 1; i < offsets.size(); i++) pdf.write(String.format("%010d 00000 n \n", offsets.get(i)).getBytes(StandardCharsets.ISO_8859_1));
        pdf.write(("trailer\n<< /Size " + offsets.size() + " /Root 1 0 R >>\nstartxref\n" + xref + "\n%%EOF\n").getBytes(StandardCharsets.ISO_8859_1));
        Files.write(destination, pdf.toByteArray());
    }

    private static void object(ByteArrayOutputStream pdf, List<Integer> offsets, int number, String value) throws IOException {
        offsets.add(pdf.size());
        pdf.write((number + " 0 obj\n" + value + "\nendobj\n").getBytes(StandardCharsets.ISO_8859_1));
    }

    private static void streamObject(ByteArrayOutputStream pdf, List<Integer> offsets, int number, byte[] stream) throws IOException {
        offsets.add(pdf.size());
        pdf.write((number + " 0 obj\n<< /Length " + stream.length + " >>\nstream\n").getBytes(StandardCharsets.ISO_8859_1));
        pdf.write(stream);
        pdf.write("endstream\nendobj\n".getBytes(StandardCharsets.ISO_8859_1));
    }

    private static String pdfText(String value) {
        return value.replaceAll("[^\\x20-\\x7E]", "?").replace("\\", "\\\\").replace("(", "\\(").replace(")", "\\)");
    }

    private static String repeat(char character, int count) {
        return String.valueOf(character).repeat(count);
    }

    private static String capitalize(String value) {
        return Character.toUpperCase(value.charAt(0)) + value.substring(1);
    }
}
