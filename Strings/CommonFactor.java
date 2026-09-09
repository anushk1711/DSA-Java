import java.util.Scanner;
public class CommonFactor{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int gcd = findGCD(arr[0],arr[1]);

        for(int i=1;i<=gcd;i++){
            if(gcd%i==0){
                System.out.print(i + " ");
            }
        }

    }
        public static int findGCD(int n1 , int n2){
            while(n2!=0){
                int temp = n2;
                n2 = n1%n2;
                n1 = temp;
            }
            return n1;

        }
}