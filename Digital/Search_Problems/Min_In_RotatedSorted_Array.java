import java.util.*;

public class Min_in_RotatedSorted_Array{
    public static int findingMin(int[] arr){
        int low = 0;
        int high = arr.length-1;

        int ans = arr[0];

        while(low<=high){
            
            if(arr[low] <= arr[high]){
                ans = Math.min(ans,arr[low]);
                break;
            }

            int mid = low+(high-low)/2;

            if(arr[low] <= arr[mid]){
                ans = Math.min(ans,arr[low]);
                low = mid+1;
            }else{
                ans = Math.min(ans, arr[mid]);
                high = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[] arr = {4,5,6,7,0,1,2};

        int result = findingMin(arr);

        System.out.print(result);
    }
}