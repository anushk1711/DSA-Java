import java.util.Scanner;
public class UppercaseCount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        int count = 0;

        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                count++;
            }
        }
        System.out.print(count);

    }
}