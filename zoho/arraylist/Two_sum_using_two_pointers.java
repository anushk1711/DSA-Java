//works directly when array is sorted else we need to sort the elements by bruteforce else builtin (Arrsy.sort)
import java.util.Scanner;

public class Two_sum_using_two_pointers{

    public void  twoPointers(int[] nums,int target){
        
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            if(nums[left] + nums[right] < target){
                left++;
            }else if(nums[left] + nums[right] > target){
                right--;
            }else{ 
                    System.out.print(nums[left] + " " + nums[right]);
                    return;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        Two_sum_using_two_pointers tp = new Two_sum_using_two_pointers();

        tp.twoPointers(arr, target);
    }
}