
import java.util.*;

public class All_Peak_Elemnt{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0;i<n;i++){
            boolean left_Check = (i == 0 || arr[i] > arr[i-1]);
            boolean right_check = (i == n-1 || arr[i] > arr[i+1]);

            if(left_Check && right_check){
                al.add(i);
            }
        }

        if(al.isEmpty()){
            System.out.println("Not found");
        }else{
            System.out.println(al);//returns peak element index.
        }

        for(int index : al){
            System.out.println("corresponding index " + arr[index]);//returns arry value
        }
    }
}