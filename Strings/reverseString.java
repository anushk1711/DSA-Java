import  java.util.Scanner;
public class reverseString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        
        char[] arr = new char[n];
        for(int i=0;i<n;i++){
            arr[i] = str.charAt(i);
        }

        int j = 0;
        char[] reverse = new char[n];

        for(int i=n-1;i>=0;i--){
            reverse[j] = arr[i];
            j++;
        }
        for(j=0;j<=n-1;j++)
         System.out.print(reverse[j]);

    }
}