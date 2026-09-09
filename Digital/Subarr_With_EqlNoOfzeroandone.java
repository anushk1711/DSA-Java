import java.util.*;

public class Subarr_With_EqlNoOfzeroandone{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int maxLen = 0;


        HashMap<Integer,Integer> map = new HashMap<>();
        int difference = 0;
        map.put(0,-1);

        for(int i=0;i<n;i++){
           if(arr[i] == 0){
            difference--;
           } 
           if(arr[i] == 1){
            difference++;
           }

           if(map.containsKey(difference)){
            int len = i-map.get(difference);
            maxLen = Math.max(maxLen,len);
           }else
                map.put(difference,i);

        }
        System.out.println(maxLen);
        System.out.print(map);
    }
}