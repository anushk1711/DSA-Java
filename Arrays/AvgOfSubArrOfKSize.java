import java.util.Scanner;
public class AvgOfSubArrOfKSize{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter k");
        int k = sc.nextInt();

        int sum_of_k = 0;

        for(int i=0;i<k;i++){
            sum_of_k = sum_of_k + arr[i];
        }

        double avg = (double)sum_of_k/k;
        System.out.println(avg);


        for(int i=k;i<n;i++){
            sum_of_k = sum_of_k - arr[i-k] + arr[i];
            avg = (double)(sum_of_k/k);
        System.out.println("Avg of sub array of size k is:" + avg);
        }


    }
}