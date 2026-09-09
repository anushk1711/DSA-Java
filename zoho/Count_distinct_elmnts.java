import java.util.*;
public class  Count_distinct_elmnts{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num,1);//HashMap does not allow duplicate elements
        }
        System.out.println(map.size());//so it will print unique element array size.
        }
    }
