import java.util.Scanner;

public class Expandalphabets{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char[] ch = str.toCharArray();

        int count = 0;

        for(int i=0;i<ch.length;i++){
            if(Character.isDigit(ch[i])){
                int digit = ch[i] - '0';
                count = count*10 + digit;
            }

            else if(Character.isLetter(ch[i])){
               for(int j=0;j<count;j++){
                System.out.print(ch[i]);
               }
                count = 0;
            }

           
        }
    }
}