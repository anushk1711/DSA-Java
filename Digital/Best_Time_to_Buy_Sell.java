import java.util.Scanner;

public class Best_Time_to_Buy_Sell{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int minPrice = arr[0];
        int maxProfit = 0;

        for(int i=1;i<n;i++){
            if(arr[i] < minPrice){
                minPrice = arr[i];
            }

            maxProfit = Math.max(maxProfit, arr[i]-minPrice);
        }

        System.out.print("Best time to buy: " + minPrice + " " + "Best time to Sell: " + maxProfit);
    }
}