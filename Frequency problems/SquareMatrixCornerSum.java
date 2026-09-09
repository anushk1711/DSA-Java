import java.util.Scanner;

public class SquareMatrixCornerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        // Input
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Corner sum
        int sum = arr[0][0] 
                + arr[0][n-1] 
                + arr[n-1][0] 
                + arr[n-1][n-1];

        System.out.print(sum);
    }
}