
import java.util.*;

public class Kth_Largest_Element{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = {3,2,1,5,6,4};
        int k = 2;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int num : arr){
            pq.add(num);

            if(pq.size() > k){
                pq.poll();
            }
        }

        System.out.println(pq.peek());

    }
}