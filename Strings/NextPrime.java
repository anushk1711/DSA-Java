
import java.util.Scanner;
public class NextPrime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int next = n+1;

        while(true){
        int count = 0;
        for(int i=1;i<=next;i++){
            if(next%i == 0){
                System.out.print(next);
                count++;
            }
        }
            // if(count == 2){
            //     System.out.print(next);
            //     break;
            // }
            next++;
        }

    }
}