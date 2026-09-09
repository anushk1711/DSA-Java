import java.util.*;

public class First_Occurance{
    public static int firstOccurance(int[] arr, int t){
        int low = 0;
        int high = arr.length-1;
        int ans = arr.length;

        while(low <= high){
        int mid = low+(high-low)/2;
           if(arr[mid] == t){
            ans = mid;
            high = mid-1;
           } else if(arr[mid] < t){
            low = mid+1;
           }else{
            high = mid-1;
           }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 4, 4, 4, 7, 9};
        int target = 4;

        int result = firstOccurance(arr,target);
        System.out.print(result);
    }
}