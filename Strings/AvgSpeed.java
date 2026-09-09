
import java.util.Scanner;
public class AvgSpeed{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] arr = str.split(" ");
        
        double distance = 0;
        double time = 0;
        double avg = 0;

        for(int i=0;i<arr.length;i++){
            String[] astric = arr[i].split("@");
            distance = distance + Double.parseDouble(astric[0]);
            time = time + Double.parseDouble(astric[1]);

        }
            avg = distance/time;

        System.out.printf("%.2f kmph",avg);
    }
}