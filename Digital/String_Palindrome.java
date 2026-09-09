import java.util.Scanner;

public class String_Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        str = str.replace(" ","").toLowerCase();


        int left = 0;
        int right = str.length()-1;
        boolean palindrome = true;

        while(left < right){
            if(str.charAt(left) == str.charAt(right)){
                palindrome = false;
            }
                left++;
                right--;
        }

        if(palindrome){
            System.out.print("Not Palindrome");
        }else{
            System.out.print("Palindrome");
        }
    }
}