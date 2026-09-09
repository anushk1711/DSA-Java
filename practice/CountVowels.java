import java.util.Scanner;
public class CountVowels{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;
 
        //instead of using str.charAt(i) again and again use
        //char ch = str.charAt(i);
        //if u want vowels checking easily convert string str.LowerCase() then u will find vowels easily not tocheck for uppercase

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) =='a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U'){
                count++;
            }
        }
        System.out.print(count);

    }
}