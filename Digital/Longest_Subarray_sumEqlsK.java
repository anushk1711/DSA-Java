import java.util.*;

public class Longest_Subarray_sumEqlsK{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = {1,2,-2,2,3};
        int k = sc.nextInt();

        HashMap<Integer,Integer> map = new HashMap<>();
        
        int sum = 0;
        int maxLen = 0;

        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];

            if(sum == k){
                maxLen = i+1;
            }

            if(map.containsKey(sum-k)){
                int len = i - map.get(sum - k);//finds start of subarray

                maxLen = Math.max(maxLen,len);//compares maxlen and len value.
            }

            if(!map.containsKey(sum-k)){
                map.put(sum,i);
            }
        } 

        System.out.print(maxLen);
    }
}