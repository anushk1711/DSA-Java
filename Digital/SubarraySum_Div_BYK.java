import java.util.*;

public class SubarraySum_Div_BYK{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int k =sc.nextInt();
        int sum = 0;
        int count = 0;


        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0,1);

        for(int i=0;i<n;i++){
            sum = sum+arr[i];
            int remainder = sum%k;

            if(map.containsKey(remainder)){
                count = count+map.get(remainder);
            }
        map.put(remainder,map.getOrDefault(remainder,0)+1);
            
        }

        System.out.print(count);
        System.out.print(map);
    }
}