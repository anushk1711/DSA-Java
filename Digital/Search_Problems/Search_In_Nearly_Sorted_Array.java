import java.util.*;

public class Search_In_Nearly_Sorted_Array{
    public static int findingTarget(int[] arr,int t){
        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(arr[mid] == t){
                return mid;
            }else if(mid-1 >= low && arr[mid-1] == t){
                    return mid-1;
            }else if(mid+1 <= high && arr[mid+1] == t){
                return mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {10, 30, 20, 40, 50, 70, 60};
        int target = 70;

        int result = findingTarget(arr,target);
        System.out.print(result);
    }
}