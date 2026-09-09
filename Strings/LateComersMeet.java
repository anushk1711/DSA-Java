import java.util.Scanner;
public class LateComersMeet{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] arr = str.split(" ");
        int count = 0;
        
        
        for(int i=0;i<arr.length;i++){
            String[] hours = arr[i].split(":");
            int hr = Integer.parseInt(hours[0]);
            int minute = Integer.parseInt(hours[1]);
            if(hr > 10 || (hr==10 && minute > 0)){
                count++;
            }
        }
        System.out.println(count);
    }
}