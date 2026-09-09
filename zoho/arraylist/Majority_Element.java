import java.util.HashMap;
import java.util.Scanner;
public class Majority_Element{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int majority = n/2;

        // for(int i=0;i<n;i++){
        //     int count = 0;
        //     for(int j=0;j<n;j++){
        //         if(arr[i] == arr[j]){
        //             count++;
        //         }
        //     }
        //     if(count > majority){
        //         System.out.print(arr[i]);
        //         return;
        //     }
        // }

        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            }else{
                map.put(arr[i],1);
            }

            if(map.get(arr[i]) > majority){
                System.out.print(arr[i]);
            }
        }
        // System.out.print(map + " ");

    }
}