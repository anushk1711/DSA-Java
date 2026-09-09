import java.util.Scanner;

public class BubbleSort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];


        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n-1;i++){

        boolean isswapped = true;

            //sorting the array
            for(int j=0;j<n-i-1;j++){
                if(arr[j] < arr[j+1]){ //descending order if ascending order arr[j] > arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isswapped = true;
                }
            }
            
        if(!isswapped){
            break;
        }
        }

        //sorted array printing
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        int Largest = arr[0];
        int secLargest = -1;

        //second largest element
        for(int i=0;i<n;i++){
            if(arr[i] != Largest){
                secLargest = arr[i];
                break;
            }
        }

        if(secLargest == -1){
            System.out.println("NO Second Largest");
        }else
           System.out.println("Second Largest: " + secLargest);

           int smallest = arr[n-1];

           int secSmallest = -1;

           //second smallest
           for(int i=n-2;i>=0;i--){
            if(arr[i] != smallest){
                secSmallest = arr[i];
                break;
            }
           }
                if(secSmallest == -1){
            System.out.println("NO Second smallest");
        }else
           System.out.println("Second smallest: " + secSmallest);

    }
}