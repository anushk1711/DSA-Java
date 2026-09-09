import java.util.Scanner;

public class ArrayBasic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int sum = 0;

        // take first element first
        arr[0] = sc.nextInt();
        int max = arr[0];
        int min = arr[0];
        sum = arr[0];

        // loop from 1
        for(int i = 1; i < arr.length; i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];

            if(arr[i] > max){
                max = arr[i];
            }

            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("max: " + max);
        System.out.println("min: " + min);
        System.out.println("sum: " + sum);

        // reverse print
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
         int counteven = 0;
         int countodd = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 == 0){
                counteven++;
            }
            else 
              countodd++;
        }

        System.out.println("Even: " + counteven);
        System.out.println("Odd: " + countodd);

    
    }
}