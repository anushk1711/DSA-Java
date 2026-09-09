import java.util.*;

public class Search_Insert_Position{
    public static int Insert_Position(int[] arr, int t){
        int low = 0;
        int high = arr.length-1;

        while(low <= high){
            int mid = low+(high-low)/2;
            if(arr[mid] == t){
                return mid;
            }else if(arr[mid] < t){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return low;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int[] arr = {1, 3, 5, 6};
            int target = 2;

            int result = Insert_Position(arr,target);
            System.out.print(result);
        }
    }
