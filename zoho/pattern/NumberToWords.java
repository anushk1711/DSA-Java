import java.util.Scanner;

public class NumberToWords{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] ones = { 
          "",  "One" ,"Two","Three","Four", "Five","Siz","Seven","Eight","Nine"
        };

        String[] teens = {
           "Ten", "Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Nineteen"
        };

        String[] tens = {
           "","", "Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"
        };

        int num = sc.nextInt();

        if(num > 100){
            System.out.print(ones[num/100] + " Hundred ");
            num = num%100;
        }
         if(num >= 10 && num <= 19){
            System.out.print(teens[num - 10]);
        }else{
            System.out.print(tens[num/10] + " ");
            System.out.print(ones[num%10]);
        }


    }
}