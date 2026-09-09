import java.util.Scanner;
public class OddLengthStrMiddleLetters{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        
        if(str.length()%2 == 1){
            int mid = str.length()/2;
            System.out.print(str.charAt(mid-1) + "" + str.charAt(mid) + "" + str.charAt(mid+1));
        }
    }
}