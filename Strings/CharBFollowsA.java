
import java.util.Scanner;
public class CharBFollowsA{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char firstChar = sc.next().charAt(0);
        char secChar = sc.next().charAt(0);

        int count = 0;

        for(int i=0;i<str.length()-1;i++){
            char ch = str.charAt(i);
            if(str.charAt(i)  == firstChar && str.charAt(i+1) == secChar ){
                count++;
            }
            
        }
       
           System.out.print(count);
    }
}