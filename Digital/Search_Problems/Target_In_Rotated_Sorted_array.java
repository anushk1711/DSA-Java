import java.util.*;

public class Target_In_Rotated_Sorted_array{
    public static int findingTarget(int[] arr, int t){
        int low = 0;
        int high = arr.length-1;
        boolean sorted = false;
        int found = arr.length;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(arr[mid] == t){
                found = mid;
                break;
            }

            if(arr[low] <= arr[mid]){
                sorted = true;
                if(sorted){
                    if(t >= arr[low] && t < arr[mid]){
                        high = mid-1;
                    }else{
                        low = mid+1;
                    }   
                }
            } else{ 
                    if(t > arr[mid] && t <= arr[high]){
                        low = mid+1;
                    }else{
                            high = mid-1;
                         }
                    }
                }
        return found;
            }
            public static void main(String[] args){
                int[] arr = {4,5,6,7,0,1,2};
                int target = 8;

                int result = findingTarget(arr,target);

                System.out.print(result);
            }
        }
    
