import java.util.Scanner;

public class SumofInt{
    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] arr = str.split(" ");

        int sum = 0;

        for(int i=0;i<arr.length;i++){
            int num = Integer.parseInt(arr[i]);
            sum = sum+num;

        }

        System.out.print(sum);
        
    }
}