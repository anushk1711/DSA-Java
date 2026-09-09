import java.util.Scanner;

class Fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 0;
        int b = 1;

        if(n==1){
            System.out.print(0);
        }else
            System.out.print(a + " " + b + " ");
            
        int c = 0;

        for(int i=3;i<=n;i++){
            c= a+b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }

    }
}