import java.util.Scanner;

public class MissingNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n-1];

        int sum = 0;

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            sum = sum+arr[i];

        }

        int total_sum = n * (n+1)/2;

        int missingNumber = total_sum - sum;

        System.out.print(missingNumber);
    }
}