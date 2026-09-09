import java.util.*;
public class MinHeapDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(40);
        pq.add(30);
        pq.add(5);
        pq.add(15);

        System.out.println(pq);
        System.out.println(pq.peek());

        pq.poll(); 
        
        System.out.println(pq.peek());
        
    }
}

//output : [5,15,30,40]