import java.util.Scanner;
public class palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int original = n;
        int reverse = 0;

        while(n!=0){
            int lastdigit = n%10;
            reverse = reverse*10+lastdigit;
            n = n/10;
        }
        if(original == reverse)
            System.out.print("Palindrom");
        else
            System.out.println("not a palindrome");
    }
}
