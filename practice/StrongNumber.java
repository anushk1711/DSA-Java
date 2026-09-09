import java.util.Scanner;

class StrongNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int original = n;

        int sum = 0;

        while(n!=0){
            int digit = n%10;
            int fact = 1;

            for(int i=1;i<=digit;i++){
                fact = fact*i;
            }
            sum = sum+fact;
            n = n/10;
        }

        System.out.println(sum);
        if(sum == original){
            System.out.println("Strong number");
        }
        else
          System.out.println("not Strong number");
    }
}