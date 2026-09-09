import java.util.*;

public class Demo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();

        }

        int target = sc.nextInt();
        boolean found = false;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                found = true;
                System.out.println(map.get(complement) + " " + i);
                System.out.println(complement + " " + arr[i]);
                return;
            }

           map.put(arr[i],i);
           
        }
    }
}