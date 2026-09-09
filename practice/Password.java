import java.util.Scanner;

public class Password{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int n = str.length();

        boolean haslength = false;
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        if(n>=9){
            haslength = true;
            for(int i=0;i<n;i++){
                char ch = str.charAt(i);

                if(Character.isUpperCase(ch)){
                    System.out.println("Perfect Password");
                    break;
                }else if(Character.isLowerCase(ch)){
                    System.out.println("Perfect Password");
                    break;
                }else if(Character.isDigit(ch)){
                    System.out.println("Perfect Password");
                }else{
                    hasSpecial = true;
                }
            }
        if(haslength && hasUpper && hasLower && hasDigit && hasDigit && hasSpecial){
            System.out.println("Perfect Password");
        }else{
            System.out.println("Not a Perfect Password");
        }
    }else{
                    System.out.println("Not a Perfect Password");

    }sc.close();

        }
}