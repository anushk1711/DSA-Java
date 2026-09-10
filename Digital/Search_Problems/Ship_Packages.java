import java.util.*;

public class Ship_Packages{
    public static int minCapacity(int[] arr, int days){
        int low = 0;
        int high = 0;

        for(int weight : arr){
            low = Math.max(low, weight);
            high = high+weight;
        }

        int ans = high;

        while(low <= high){
            int mid = low+(high-low)/2;
            int requiredDays = 1;
            int currentWeight = 0;

            for(int weight : arr){
                if(currentWeight+weight <= mid){
                    currentWeight += mid;
                }else{
                    requiredDays++;
                    currentWeight = weight;
                }
            }

            if(requiredDays<=days){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
    return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int days = sc.nextInt();

        int result = minCapacity(arr, days);
        System.out.print(result);
    }
}