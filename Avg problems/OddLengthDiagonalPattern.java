import java.util.Scanner;

public class OddLengthDiagonalPattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int n = str.length();

        //rows
        for(int i=0;i<str.length();i++){
            //columns
            for(int j=0;j<str.length();j++){
               //first diagonal
               if(i == j){
                System.out.print(str.charAt(i));
               }
               //second diagonal
               else if(i+j == n-1){
                System.out.print(str.charAt(i));
               }
               //else space
               else{
                System.out.print(" ");
               }

            }

            System.out.println();
            
        }
    }
}