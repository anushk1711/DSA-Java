import java.util.Scanner;

public class CountPrimesInRange{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int totalCount = 0;
        for(int i=n1;i<=n2;i++){

            int count = 0;

            for(int j=1;j<=n2;j++){

                if(i%j == 0){
                    count++;
                }
            }
        if(count == 2){
            totalCount++;
        }
        }


        System.out.print(totalCount);

    }
}