import java.util.*;

public class SubArray_Sum_EqualsK{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            int k = sc.nextInt();

            int prefixSum = 0;
            int count = 0;

            HashMap<Integer,Integer> map = new HashMap<>();
                map.put(0,1);
            for(int i=0;i<n;i++){
                prefixSum = prefixSum+arr[i];

                if(map.containsKey(prefixSum - k)){
                    count = count + map.get(prefixSum - k);
                }

                map.put(prefixSum, map.getOrDefault(prefixSum,0)+1);
            }

            System.out.println(count);
            System.out.print(map);
        }
    }
