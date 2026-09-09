
import java.util.Scanner;
public class interlace{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int odd = (A % 2 == 1)? A : A+1;
        int even = (B % 2 == 0)? B : B-1;

        int oddcount = (B+1)/2 - A/2;
        int evencount = B/2 - (A-1)/2;

        boolean startOdd = (oddcount >= evencount);

        while(odd <= B || even >= A){

        if(startOdd){
            if(odd <= B){
                System.out.print(odd + " ");
                odd += 2;

            }
             if(even >= A){
                System.out.print(even + " ");
                even -= 2;
            }
        }
        else{
            if(even >= A){
                System.out.print(even + " ");
                even -= 2;
            }

            if(odd <= B){
                System.out.print(odd + " ");
                odd += 2;
            }
        }
        }
    }
}