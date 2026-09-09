import java.util.Scanner;
public class Decodestring{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isLetter(ch)){
                int num = 0;
                i++;
                while(i<str.length() && Character.isDigit(str.charAt(i))){
                    num = num*10+(str.charAt(i) - '0');
                    i++;
                }
                for(int j=1;j<=num;j++){
                    System.out.print(ch);
                }
                i--;
            }
        }
        
    }
}