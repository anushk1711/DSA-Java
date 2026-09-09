import java.util.Scanner;

public class MaxSumSubArrOfSizeK{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n");
        int n = sc.nextInt();
        int[] arr = new int[n];

        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter k");
        int k =sc.nextInt();
        int Sum_of_k = 0;
        for(int i=0;i<k;i++){
            Sum_of_k = Sum_of_k + arr[i];
        }

        int max_sum = Sum_of_k;

        for(int i=k;i<n;i++){
            Sum_of_k = Sum_of_k - arr[i-k]+arr[i];
            if(Sum_of_k > max_sum){
                max_sum = Sum_of_k;
            }
        }
        System.out.println(max_sum);
    }
}