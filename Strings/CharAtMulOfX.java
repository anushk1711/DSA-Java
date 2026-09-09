import java.util.Scanner;
public class CharAtMulOfX{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int num = sc.nextInt();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if((i+1) % num == 0){
                System.out.print(ch);
            }
        }
    }
}