import java.util.Scanner;
public class FirstLetterUpper{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        
        String result = "";
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if((i==0 && ch != ' ') || (ch != 0 && str.charAt(i-1)== ' ')){
                result = result + Character.toUpperCase(ch);
            }
            else 
               result += ch;
        }
                System.out.print(result);
       
    }

}