import java.util.Scanner;
public class FirstNonRepChar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        boolean isUnique = true;
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            isUnique = true;
            for(int j=0;j<str.length();j++){
                if(i!=j && str.charAt(i) == str.charAt(j)){
                    isUnique = false;
                    break;
                }

            }
            if(isUnique){
                System.out.print(ch);
                break;
            }
        }

    }
}