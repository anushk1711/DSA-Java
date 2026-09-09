import java.util.Scanner;

class Armstrong{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int original = n;
        int count = 0;
        int sum = 0;
        int digit = 0;
        int temp = n;

        while (temp!=0){
            count++;
            temp = temp/10;

        }
        temp = n;
        while(temp!=0){
            digit = temp%10;
            sum = sum+(int)Math.pow(digit,count);
            temp = temp/10;
            
        }

        if(sum == original){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
    }
}