import java.util.*;

public class ArithmaticExpression{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(Character.isDigit(ch)){
                stack.push(ch - '0');
            }else{
                int b = stack.pop();
                int a = stack.pop();

                int result = 0;

                if(ch == '+'){
                    result = a+b;
                }else if(ch == '-'){
                    result = a-b;
                }else if(ch == '*'){
                    result = a*b;
                }else if(ch =='/') {
                    result = a/b;
                }

                stack.push(result);
            }
        }
        // System.out.println(stack.pop());
        System.out.println(stack);
    }
}