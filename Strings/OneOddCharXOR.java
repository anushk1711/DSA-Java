//we can also check palindrome string by XOR gate in the code because XOR removes pair elements 0^0 = 0
//this program only works when string has only odd frequency characters. else it won't work
import java.util.Scanner;

public class OneOddCharXOR{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char  result =  0;

        for(int i=0;i<str.length();i++){
            result^=str.charAt(i);
        }
        System.out.println(result);
    }
}