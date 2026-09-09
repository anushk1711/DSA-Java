import java.util.Scanner;

public class Reversesign{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num == 0){
            System.out.print(num);
        }
        else if(num < 0){
            System.out.print(num*(-1));
        }

        else if(num > 0){
            System.out.print(num*(-1));
        }
    }
}