
import java.util.Scanner;

public class Leaders_in_Array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            boolean leader = false;
            for(int j=1;j<n;j++){
                if(arr[i] > arr[j]){
                    leader = true;
                }
            }

            if(leader){
                System.out.println(arr[i]);
                return;
            }
        }

    }
}