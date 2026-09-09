
import java.util.Scanner;
public class CheckingPalindromeFarming{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int[] freq = new int[256];

        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)]++;
        }

       
        int oddcount = 0;

        for(int i=0;i<str.length();i++){
            if(freq[str.charAt(i)]%2!=0){
            oddcount++;
        }
        }

        if(oddcount<=1){
            System.out.println("Palindrome is possible");
        }
        else{
            System.out.println("Not Possible");
        }

    }
}
