import java.util.*;

public class Max_SumOfSubarray_OfKsize{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int windowSum = 0;

        for(int i=0;i<k;i++){
            windowSum = windowSum+arr[i];
        }

        int max_sum = windowSum;

        for(int i=k;i<n;i++){
            windowSum = windowSum - arr[i-k]+arr[i];
            if(windowSum > max_sum){
                max_sum = windowSum;
            }
        }
        System.out.print(max_sum);
    }
}