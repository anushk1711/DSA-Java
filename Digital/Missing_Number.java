import java.util.Scanner;

public class Missing_Number{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int Expsum =0;
        int Actsum = 0;
        int missing = n;

        for(int i=0;i<n;i++){
            // Expsum = Expsum+i+1;
            // Actsum = Actsum+arr[i];

            //  missing = Expsum - Actsum;

            //xor operation 
            missing = missing ^ i ^ arr[i];
            
        }
        System.out.print(missing);
    }
}