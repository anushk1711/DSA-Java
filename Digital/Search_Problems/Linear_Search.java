import java.util.*;

public class Linear_Search{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = {5,8,2,10,3,7};
        int target = 3;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
               System.out.print(i);
            }
        }
    }
}