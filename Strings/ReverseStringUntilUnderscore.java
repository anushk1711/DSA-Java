import java.util.Scanner;
public class ReverseStringUntilUnderscore{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char[] ch = str.toCharArray();
        int count;
        boolean found = false;

        for(int i=0;i<ch.length;i++){
           
            if(ch[i] == '_'){
                found = true;
                count = i;
                System.out.println(count);
            for(int j=count-1;j>=0;j--){
                System.out.print(ch[j]);
            }
        System.out.print(ch[i]);
        for(int k=i+1;k<ch.length;k++){
            System.out.print(ch[k]);
        }
        break;
        }
        
        }
    if(!found){
        for(int h=ch.length-1;h>=0;h--){
            System.out.print(ch[h]);
        }
    }
     }
}

    
