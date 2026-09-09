import java.util.*;
public class Secnd_Large{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int Largest = arr[0];
        int Second = 0;

        for(int i=0;i<n;i++){
            if(arr[i] > Largest){
                Second = Largest;
                Largest = arr[i];
            }

            if(arr[i] > Second && arr[i] != Largest ){
                Second = arr[i];
            }
        }
        System.out.println("Largest: " + "" + Largest + "Second Largest " + Second);
    }
}