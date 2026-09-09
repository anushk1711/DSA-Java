import java.util.Scanner;

public class SecLargest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int Seclargest = 0;

        for(int i=0;i<n;i++){
            if(arr[i] > largest){
                Seclargest = largest;
                largest = arr[i];
            }

            if(arr[i] > Seclargest && arr[i] != largest){
                Seclargest = arr[i];

            }
        }

        System.out.println("largest: " + largest);
        System.out.println("seclargest: " + Seclargest);
    }

}