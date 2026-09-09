
import java.util.*;

public class   {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 1, 1, 2, 2, 5, 5, 5, 3};
        int k = 2;

        HashMap<Integer, Integer> hmap = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        for (int num : arr) {
            hmap.put(num, hmap.getOrDefault(num, 0) + 1);

        }
        System.out.println(hmap); 

        for (Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());

            pq.offer(entry);

            if (pq.size() > k) {
                pq.poll();
            }

        }
        while (!pq.isEmpty()) {
            System.out.println(pq.poll().getKey());
        }

    }
}
