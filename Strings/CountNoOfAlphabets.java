import java.util.Scanner;
public class CountNoOfAlphabets{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int alphabet_Count = 0;
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(Character.isLetter(ch)){
                alphabet_Count++;
                System.out.print(ch + " ");
            }
        }
        System.out.print(alphabet_Count);



    }
}