
import java.util.Scanner;


public class Fibonacci{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        long prev1 = 0;
        long prev2 = 1;
        System.out.print(prev1 + " " + prev2 + " ");
        for(int i=0;i<n-2;i++){
            long next = prev1 + prev2;
            System.out.print(next + " ");
            prev1 = prev2;
            prev2 = next;
        }
    }
}