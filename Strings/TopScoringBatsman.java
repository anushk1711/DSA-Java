//it is also same as the previous problem but in this code we are accepting and spliting and also assigning values in loop itself by running loop from 0 to n
import java.util.Scanner;

public class TopScoringBatsman{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();

        int top_scoring_batsman = Integer.MIN_VALUE;
        String batsman = "";
        

        for(int i=0;i<n;i++){
            String str = sc.nextLine();
            String[] coma = str.split(",");
            int scorer = Integer.parseInt(coma[1]);
            if(scorer > top_scoring_batsman){
                top_scoring_batsman = scorer;
                batsman = coma[0];
            }
        }
        System.out.print(batsman);
    }
}

