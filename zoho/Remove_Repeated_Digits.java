
import java.util.Scanner;


public class Remove_Repeated_Digits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        

        for(int i=n1; i<=n2;i++){
            int last = i%10;
            int remain = i/10;
            if(last != remain){ System.out.print(i + " ");
            }
            
        }
    }
}