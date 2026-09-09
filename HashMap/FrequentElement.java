import java.util.*;
public class FrequentElement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;
        int maxEl = 0;

        for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);

            }else
              map.put(num,1);
              
        }

        for(int key : map.keySet()){
            if(map.get(key) > max){
                max = map.get(key);
                maxEl = key;
              }
        }
        System.out.println(map);
        System.out.println(max);
        System.out.println(maxEl);
    }
}