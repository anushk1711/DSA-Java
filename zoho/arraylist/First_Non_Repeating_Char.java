
import java.util.Scanner;

public class First_Non_Repeating_Char{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char[] ch = str.toCharArray();

        for(int i=0;i<str.length();i++){
        boolean found = false;
           for(int j=0;j<str.length();j++){
                if(i != j && ch[i] == ch[j]){
                    found = true;
                    break;
                }
           }
           if(!found){
            System.out.print(ch[i]);
            break;
           }
            
        }


    }
}
