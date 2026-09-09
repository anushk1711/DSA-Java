
import java.util.*;
public class Two_Sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        boolean found = false;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            int res = target - arr[i];
            if(map.containsKey(res)){
                found = true;
                System.out.println(map.get(res) + " " + i);
            }
            else{
                map.put(arr[i],i);  
            }
        }
    }
}

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         // your code
// HashMap<Integer,Integer> map = new HashMap<>();

//         for(int i=0;i<nums.length;i++){
//             boolean found = false;
//             int res = target - nums[i];
//             if(map.containsKey(res)){
//                 found = true;
//                return new int[]{map.get(res),i};
//             }else{
//                 map.put(nums[i],i);
//             }
//         }
//         return new int[]{};
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }

//         int target = sc.nextInt();
//         Solution obj = new Solution();
//         obj.twoSum(arr,target);
//     }
// }







