import java.util.Scanner;

public class CountingPairofCharacters{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        int[] freq = new int[256];

       for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)]++;
       }
        int count = 0;
       for(int i=0;i<s2.length();i++){
            if(freq[s2.charAt(i)] > 0) {
                count++;
                freq[s2.charAt(i)]--;
            }
       }
       System.out.print(count);



    }
}
