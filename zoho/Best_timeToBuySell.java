import java.util.*;

public class Best_timeToBuySell{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int minPrice = arr[0];
        int maxProfit = 0;

        int tempBuyDay = 0;
        int buyDay = 0;
        int sellDay = 0;

        for(int i=1;i<n;i++){
            if(arr[i] < minPrice){
                minPrice = arr[i];
                tempBuyDay = i;
            }

            int profit = arr[i] - minPrice;
            if(profit > maxProfit){
                maxProfit = profit;
                buyDay = tempBuyDay;
                sellDay = i;
            }
        }

        System.out.println("Best time to Buy at a day is: " + buyDay);
        System.out.println("Best time to sell at a Day is: " + sellDay);
    }
}