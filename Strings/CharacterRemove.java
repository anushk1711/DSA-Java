import java.util.Scanner;
public class CharacterRemove{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        
        if(n > 2){
            String result = str.substring(1, str.length()-3);
            System.out.print(result);
        }

    }
}