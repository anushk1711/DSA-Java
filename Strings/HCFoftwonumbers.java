import java.util.Scanner;
public class HCFoftwonumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int smaller;
        if(a<b){
            smaller = a;
        }
        else 
            smaller = b;
        int hcf = 0;
        for(int i=1;i<smaller;i++){
            if(a%i==0 && b%i==0){
                hcf=i;
            }
        }
        System.out.print(hcf);
    }
}