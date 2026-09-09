import java.util.Scanner;
public class CommonPart{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        String answer = " ";


        for(int len= Math.min(s1.length(),s2.length()); len>=1;len--){
        String part1 = s1.substring(s1.length() - len);
        String part2 = s2.substring(0,len);

        if(part1.equals(part2)){
            answer = part2;
            break;
        }
            

        }
            System.out.print(answer);

    }
}