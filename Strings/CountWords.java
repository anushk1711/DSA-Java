import java.util.Scanner;

public class CountWords{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        boolean inWord = false;
        int count = 0;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            //checks space
            if(ch != ' '){
                //checks ch is in word or not if it is count++
                //and inWord = true
                if(!inWord){
                    count++;
                    inWord = true;
                }
                //else inWord = false
            } else{
                inWord = false;
            }
        }
        //print the count
        System.out.print(count);
    }
}