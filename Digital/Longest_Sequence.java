import java.util.*;

public class Longest_Sequence{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){
            set.add(num);
        }

        int maxLength = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                int currentNum = num;
                int length = 1;


            while(set.contains(currentNum+1)){
                currentNum++;
                length++;
            }
                maxLength = Math.max(maxLength, length);
            
            }
        }
                System.out.print("Longest Sequence length is: " + maxLength);


    }
}