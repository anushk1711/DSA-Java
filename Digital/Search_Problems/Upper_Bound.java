import java.util.*;

public class Upper_Bound{
    public static int upperBound(int[] arr, int t){
        int low = 0;
        int high = arr.length-1;
        int ans = arr.length;

        while(low <= high){
            int mid = low+(high-low)/2;
            if(arr[mid]>t){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 4, 4, 4, 7, 9};
        int target = 4;

        int result = upperBound(arr,target);
        System.out.print(result);
    }
}