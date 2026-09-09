import java.util.*;

public class Rotate_Array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        k = k%n;//consider k = 2 & n = 4 if we divide k%n= we get reminder as k only

        for(int i=0;i<k;i++){
        int last = arr[n-1];

        for(int j=n-1;j>0;j--){
            arr[j] = arr[j-1];
        }
        arr[0] = last;
        }

        System.out.println("Rotated Array");
        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }
}