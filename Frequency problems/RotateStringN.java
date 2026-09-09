import java.util.*;

public class RotateStringN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int n = sc.nextInt();

        int len = str.length(); 

        // Print from n to end
        for(int i = len-n; i < len; i++){
            System.out.print(str.charAt(i));
        }

        // Print from 0 to n-1
        for(int i = 0; i < str.length()-n; i++){
            System.out.print(str.charAt(i));
        }
    }
}