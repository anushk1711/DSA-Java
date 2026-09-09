// import java.util.*;

// public class Prefix_SumOf_Subarray{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }

//         int k = sc.nextInt();
//         int sum = 0;
//         int count = 0;
//         HashMap<Integer,Integer> map = new HashMap<>();
//         map.put(0,1);

//         for(int x=0;x<n;x++){
//             sum += arr[x];
//             if(map.containsKey(sum-k)){
//                 count = count+map.get(sum-k);
//             }
//             else{
//                 map.put(sum, map.getOrDefault(sum,0)+1);
//             }
//         }

//         System.out.print(count);
//         // System.out.print(map);
        
//     }
// }

import java.util.*;

public class Prefix_SumOf_Subarray {

    public static void main(String[] args) {

        int[] arr = {1, -1, 1, 1, -1};
        int k = 1;

        int sum = 0;
        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            System.out.println("\nIndex: " + i);
            System.out.println("Element: " + arr[i]);
            System.out.println("Current Sum: " + sum);

            int required = sum - k;

            System.out.println("sum - k = " + required);

            if (map.containsKey(required)) {

                count += map.get(required);

                System.out.println("Found " + required + " in map");
                System.out.println("Frequency: " + map.get(required));
                System.out.println("Count: " + count);

            } else {

                System.out.println(required + " is NOT in map");
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);

            System.out.println("Map: " + map);
        }

        System.out.println("\nFinal Answer: " + count);
    }
}