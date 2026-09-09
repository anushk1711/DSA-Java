
import java.util.Scanner;

public class MinSizeSubArrSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int end = 0; end < n; end++) {
            arr[end] = sc.nextInt();
        }

        int start = 0;

        int sum = 0;
        int end = 0;
        int window_length;
        System.out.println("Enter Targte");
        int target = sc.nextInt();
        int min_length = Integer.MAX_VALUE;
        

        for (end = 0; end < n; end++) {
            sum = sum + arr[end];
            while (sum >= target) {
                 
                window_length = end - start + 1;
                if (window_length < min_length) {
                    min_length = window_length;
                    
                }

                 for (int i = start; i <= end; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println(" ");
                    sum = sum - arr[start];
                    start++;

            }
        }
        System.out.println(min_length);

    }
}
