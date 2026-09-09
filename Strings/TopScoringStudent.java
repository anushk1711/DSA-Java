
import java.util.Scanner;
public class TopScoringStudent{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int top_scorer = Integer.MIN_VALUE;
        String Student = "";
        
        for(int i=0;i<n;i++){
            String str = sc.nextLine();
            String[] arr = str.split(":");
            int score = (Integer.parseInt(arr[1])+Integer.parseInt(arr[2])+Integer.parseInt(arr[3]));
            if(score > top_scorer){
                top_scorer = score;
                Student = arr[0];

            }

        }
        System.out.print(Student);
    }
}