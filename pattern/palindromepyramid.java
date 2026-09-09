
import java.util.Scanner;

public class palindromepyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;

        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
                
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
               
            }
            for(int j=i-1;j>=1;j--)
               System.out.print(j);
                // num++;
            System.out.println();
        }

        

    }
}
