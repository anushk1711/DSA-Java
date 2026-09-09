import java.util.Scanner;

public class SimpleCalcCommand{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int i = 0;

        // 🔹 get first number
        int result = 0;
        while(i < str.length() && Character.isDigit(str.charAt(i))){
            result = result * 10 + (str.charAt(i) - '0');
            i++;
        }

        // 🔹 process remaining
        while(i < str.length()){
            char op = str.charAt(i);
            i++;

            int num = 0;

            while(i < str.length() && Character.isDigit(str.charAt(i))){
                num = num * 10 + (str.charAt(i) - '0');
                i++;
            }

            if(op == 'a'){
                result = result + num;
            }
            else if(op == 's'){
                result = result - num;
            }
            else if(op == 'm'){
                result = result * num;
            }
            else if(op == 'd'){
                result = result / num;
            }
        }

        System.out.println(result);
    }
}