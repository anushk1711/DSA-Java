import java.util.Scanner;

public class Primetest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isprime = true;

        if(n<=1){
            isprime = false;
        }else{
            for(int i=2;i<=n/2;i++){
                if(n%2==0){
                    isprime = false;
                    break;
                }
            }
            if(isprime){
                System.out.print("Prime");
            }
            else{
                System.out.print("Not Prime");
            }
        }
    }
}