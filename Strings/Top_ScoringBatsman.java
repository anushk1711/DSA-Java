import java.util.Scanner;

public class Top_ScoringBatsman{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int top_scorer = Integer.MIN_VALUE;
        String Batsman = " ";

        for(int i=0;i<arr.length;i++){
            String[] coma = arr[i].split(",");
            int scorer = Integer.parseInt(coma[1]);
            if(scorer > top_scorer){
                Batsman = coma[0];
                top_scorer = scorer;

            }
        }
        System.out.println(Batsman);
        

    }
}
