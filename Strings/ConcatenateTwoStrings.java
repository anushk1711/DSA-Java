
import java.util.Scanner;


public class ConcatenateTwoStrings{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        int i =0;

        while(i<str1.length() && i<str2.length()){
                
                if(str1.charAt(i) < str2.charAt(i)){
                    System.out.print(str1+str2);
                    break;
                }
                else if(str2.charAt(i) < str1.charAt(i)){
                    System.out.print(str2+str1);
                    break;
                }
        i++;
        }
    }
}