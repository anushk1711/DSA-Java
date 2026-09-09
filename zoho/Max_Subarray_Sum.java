import java.util.*;

public class Max_Subarray_Sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int Final_sum = max_subarray_sum(arr);

        System.out.println("Maximum sub array sum is: " + Final_sum);

       
    }

    public static int max_subarray_sum(int[] nums){
        int currentSum = nums[0];
        int maxSum = nums[0];
        int tempStart = 0;
        int start = 0;
        int end = 0;

        for(int i=1;i<nums.length;i++){
           
            if(nums[i] > currentSum + nums[i]){
                currentSum = nums[i];
                tempStart = i;
            }
            else{
                currentSum = currentSum + nums[i];
            }

            if(currentSum > maxSum){
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
            
        }
            for(int j=start;j<=end;j++){
            System.out.print(nums[j] + " ");
            }

            
    return maxSum;
    }
}