
import java.util.Scanner;

public class Mirror_Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // for(int i=0;i<n;i++){
        //     int num = n-i;
        //     for(int j=0;j<=i;j++){
        //         System.out.print(num);
        //      System.out.print(0);
        //     num++;
        //     }
        //     System.out.println();
        // }
        //     int num = 1;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print(num);
        //     }
        //     System.out.println();
        //     num++;
        // }
        // for(int i=0;i<n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println("");
        // }
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i);
        //     }
        //     System.out.println("");
        // }
        // for (int i = 1; i <= n; i++) {
        //     for (int s = 1; s <= n - i; s++) {
        //         System.out.print(" ");
        //     }
        //     for (int k = 1; k <= i; k++) {
        //         System.out.print(k);
        //     }
        //     for(int j=i-1;j>=1;j--)
        //        System.out.print(j);
        //         // num++;
        //     System.out.println();
        // }
        for (int i = 1; i <= 5; i++) {
            for(int s = 1; s<=n-i;s++){
                System.out.print(" ");
            }

            if (i == 1) {
                System.out.println(0); 
            }else {

                for (int k = n - i + 2; k <= 5; k++) {
                    System.out.print(k);
                }

                System.out.print(0);

                for (int j = 5; j >= n - i + 2; j--) {
                    System.out.print(j);
                }
                System.out.println("");
            }

        }

    }
}
