
import java.util.Scanner;

public class ArrangeAlphabets{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char[] ch = str.toCharArray();
        
        for(int i=0;i<ch.length-1;i++){
            int j=i+1;
            if(ch[i]>ch[j]){
                System.out.print(ch[i]);
            }
            j++;
        }
        
    }
}