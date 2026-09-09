//it is baisc level reversing the string
//first we convert the string to char array --> run loop on it from arr.length-1 to >=0 --> then print arr[i].
import java.util.Scanner;

public class ReverseString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        char[] arr = str.toCharArray();
        
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }
}