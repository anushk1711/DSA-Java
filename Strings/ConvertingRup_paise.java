import java.util.Scanner;

public class ConvertingRup_paise{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        float F = sc.nextFloat();

        float amount = F*100;

        System.out.print(Math.round(amount));
    }
}