import java.util.Scanner;
public class CheckLeapyear{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int Year = sc.nextInt();

        if(Year%400 == 0){
            System.out.println("yes");
        }
        else if(Year%100 == 0){
            System.out.println("no");
        }
        else if(Year%4 == 0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}