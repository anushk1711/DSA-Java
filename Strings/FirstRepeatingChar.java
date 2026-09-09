import java.util.Scanner;
public class FirstRepeatingChar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        
        boolean found = false;


        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            for(int j=i+1;j<str.length();j++){
                if( str.charAt(i) == str.charAt(j)){
                    found = true;
                    System.out.print(ch);
                     break;
                }
            }

            if(found == true){
                break;
            }
           

        }
    }
}