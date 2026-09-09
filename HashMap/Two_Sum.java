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

        HashMap <Integer,Integer> map = new HashMap<>();

        int res = 0;

        for(int i=0;i<n;i++){
            res = target - arr[i];
            if(map.containsKey(res)){
                found = true;
                System.out.println(map.get(res) + " " + i);
            }else{
                map.put(arr[i],i);
            }
        }

    }
}