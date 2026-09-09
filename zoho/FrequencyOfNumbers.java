
import java.util.*;

public class FrequencyOfNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        
        int[] arr = {2,2,2,3,3,2};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }

            max = Math.max(max,map.get(num));

        }

        System.out.println(map);
        System.out.println(max);

    }
}
