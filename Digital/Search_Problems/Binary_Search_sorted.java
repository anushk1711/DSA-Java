import java.util.*;

public class Binary_Search_sorted{

    public static int Binary_Search(int[] arr , int t){

            int low = 0;
            int high = arr.length-1;

            while(low <= high){
                int mid = low+(high - low)/2;
                if(arr[mid] == t){
                    return mid;
                }else if(arr[mid] < t){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }

        return -1;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int[] arr = {3, 7, 11, 15, 19, 24, 30};
            int target = 24;
            int result = Binary_Search(arr,target);
            System.out.print(result);
    }
}

// Time = O(log n) ✅
// Space = O(1) for the iterative version. ✅