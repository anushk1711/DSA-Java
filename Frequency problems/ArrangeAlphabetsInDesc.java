
import java.util.Scanner;


public class ArrangeAlphabetsInDesc{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String res = "";

        for(int i=0;i<str.length();i++){

            char ch = str.charAt(i);
            if(res.indexOf(ch) == -1){
                res += ch;
            }
        }

        char[] arr = res.toCharArray();

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] < arr[j]){
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(char c : arr){
            System.out.print(c);
        }
    }
}