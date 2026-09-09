
import java.util.Scanner;

public class CorrectOperator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int A = 0;
        int B = 0;
        int C = 0;
            int num = 0;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);


            if(Character.isDigit(ch)){
                num = num*10+(str.charAt(i) - '0');
            }          

            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                A = num;
                num = 0; 
            }
            else if(ch == '='){
                B = num;
                num = 0;
            }

           
            }

            C = num;
            System.out.println(A + " " +  B + " " + C);

            if(A+B == C){
                System.out.println("+");
            }else if(A-B == C){
                System.out.println("-");
            }
            else if(A*B == C){
                System.out.println("*");
            }else if(A/B == C){
                System.out.print("/");
            }
        }
    }
