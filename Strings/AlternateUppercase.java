
import java.util.Scanner;

public class AlternateUppercase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int index = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == ' ') {
                System.out.print(" ");
                index = 0;
            } 
            else 
            {
                if(index%2 == 0){
                    System.out.print(Character.toUpperCase(ch));
                }

                else{
                    System.out.print(Character.toLowerCase(ch));
                }
            index++;
            }

        }
    }
}
