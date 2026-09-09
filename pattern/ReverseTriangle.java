import java.util.Scanner;

public class ReverseTriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for(int i=0;i<n;i++)//row
        {
            for(int j=0;j<=i;j++){
                System.out.print(" ");//space
            }
            for(int k=i;k<n;k++){
                System.out.print("* " );//*
            }
            System.out.println();
        }
    }
}

