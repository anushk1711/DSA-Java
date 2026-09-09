import java.util.Scanner;
public class FIrstRepFromLast{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        boolean found = false;

        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);

            for(int j=i-1;j>=0;j--){
                if(str.charAt(i) == str.charAt(j)){
                    System.out.print(ch);
                    found = true;
                    break;
                }
            }
            if(found == true){
                break;
            }
        }
    }
}