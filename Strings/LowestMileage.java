import java.util.Scanner;
public class LowestMileage{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] arr = str.split(" ");

        float min_mileage = Integer.MAX_VALUE;

        String car_name = " ";
        for(int i=0;i<arr.length;i++){
                String[] car = arr[i].split("@");
                float mileage = Float.parseFloat(car[1]);
                if(mileage < min_mileage){
                    min_mileage = mileage;
                    car_name = car[0];
                }
        }
        System.out.println(car_name);
    }
}