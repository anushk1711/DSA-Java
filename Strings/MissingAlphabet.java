import java.util.Scanner;

public class MissingAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int[] freq = new int[256]; // to store frequency of characters

        // Step 1: Count frequency
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        // Step 2: Find first character with odd count
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] % 2 != 0) {
                System.out.print(str.charAt(i));
                break;
            }
        }
    }
}