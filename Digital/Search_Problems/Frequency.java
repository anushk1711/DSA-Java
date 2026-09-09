import java.util.*;

public class Frequency{
    public static int firstOccurance(int[] arr, int t){
        int low = 0;
        int high = arr.length-1;
        int ans = arr.length;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(arr[mid] == t){
                ans = mid;
                high = mid-1;
            }else if(arr[mid] < t){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
    public static int lastOccurance(int[] arr,int t){
        int low = 0;
        int high = arr.length-1;
        int ans = arr.length;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid] == t){
                ans = mid;
                low = mid+1;
            }else if(arr[mid] > t){
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
        int frequency = 0;

        int last = lastOccurance(arr,target);
        int first = firstOccurance(arr,target);

        if(first == arr.length){
            frequency = 0;
        }else{
        frequency = last - first + 1;
        }
        System.out.print(frequency);
    }
}