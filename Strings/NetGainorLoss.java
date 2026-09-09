import java.util.Scanner;

public class NetGainorLoss{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] Roll = str.split(" ");

        
        int gain = sc.nextInt();
        int loss = sc.nextInt();

        int net = 0;

        for(int i=0;i<Roll.length;i++){
         int ch = Integer.parseInt(Roll[i]);
            if(ch%2 != 0){
                // System.out.println(Roll[i]);
                net = net+gain;
            }
            else
              net = net-loss;
        }

        if(net > 0){
            System.out.print(net);
        }
        else {
            System.out.print(net);
        }
}
}