import java.util.*;

public class Longest_Subarray_Sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int  n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        int target = sc.nextInt();

        for(int num : arr){
        int res = target - num;
            if(map.containsKey(res)){
                System.out.print(num + " " + res);
                return;
            }

            map.put(num,1);
        }
    }
}