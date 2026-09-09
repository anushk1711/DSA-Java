
import java.util.Scanner;


public class ArithmaticProgression{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();

        int n = sc.nextInt();

        int d = a2-a1;

        int nthNum = a1 + (n-1)*d;

        System.out.print(nthNum);
    }
}