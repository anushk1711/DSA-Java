import java.util.*;
public class Binary_SearchOn_Ans{
    public static int binarySearchOnAns(int num){
        int low = 0;
        int high = num;
        int ans = 0;

        while(low <= high){
            int mid = low+(high-low)/2;

            if(mid*mid>=num){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = binarySearchOnAns(n);

        System.out.print(result);
    }
}