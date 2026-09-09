import java.util.*;

public class Majority_Element{
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            if(map.containsKey(num)){
                map.put(num, map.getOrDefault(num,0)+1);
            }else{
                map.put(num,1);
            }
        }

        int majority = n/2;

        for(int num : map.keySet()){
            if(map.get(num) > majority){ 
                System.out.println(num);
                return;               
            }
        }

        System.out.print("Not Found");
            
    }
}