import java.util.Scanner;

public class FloydTriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

       int num = 1;
        for(int k=1;k<n;k++){
            for(int j=1;j<=k;j++){
                System.out.print(num + " ");
                num++;
            }
            
        System.out.println();
        }
    }
}