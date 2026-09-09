
import java.util.Scanner;

public class Product_Of_arr_Expt_Self {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = 1;
        right[n - 1] = 1;

        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * arr[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * arr[i + 1];
        }

        int[] ans = new int[n];
        System.out.print("Product of array Except Self is: ");
        for (int i = 0; i < n; i++) {
            ans[i] = left[i] * right[i];
            System.out.print(ans[i] + " ");
        }

    }
}
