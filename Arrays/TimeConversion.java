import java.util.Scanner;
class TimeConversion{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] parts = str.split(" ");
        String[] hm = parts[0].split(":");
        
        int hour = Integer.parseInt(hm[0]);
        int min = Integer.parseInt(hm[1]);

        String period = parts[1];

        if(period.equalsIgnoreCase("AM")){
            if(hour == 12){
                hour = 0;
            }
        } else if(period.equalsIgnoreCase("PM")){
            if(hour != 12){
                hour = hour+12;
            }
        }

        System.out.printf("24-hr format: %02d:%02d\n",hour,min);
        sc.close();

    }
}