import java.util.Scanner;
public class SortingAnArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean isSorted = true;

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted = false;
            }
        }
            if(isSorted == true){
                System.out.print("Array is sorted");
            }
            else 
                System.out.print("Array is not sorted");
    }
}