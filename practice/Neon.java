import java.util.Scanner;

class Neon{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int original = n;

        int sqr = n*n;
        System.out.println("sqr " + sqr);
        int sum = 0;

        while(sqr!=0){
            int digit = sqr%10;
            sum = sum+digit;
            sqr = sqr/10;
        }

        if(sum == original)
         System.out.println("Neon number");
        else
         System.out.print("not neon number");
    }
}