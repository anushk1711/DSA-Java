import java.util.Scanner;
public class Tengthunitsum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        sum = n%100+(n/100)%100;
        System.out.print(sum);
    }
}