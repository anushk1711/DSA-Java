
import java.util.*;

public class Remove_Duplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        // for(int i=0;i<str.length();i++){
        //     boolean duplicate = false;
        //     for(int j=0;j<i;j++){
        //         if(str.charAt(i) == str.charAt(j)){
        //             duplicate = true;
        //             break;
        //         }
        //     }
        //     if(!duplicate){
        //         System.out.print(str.charAt(i));// complexity = O(n^2)
        //     }
        // }

        // int[] freq = new int[26];

        // for(int i=0;i<str.length();i++){
        //     char ch = str.charAt(i);
        //     if(freq[ch - 'a'] == 0){
        //         System.out.print(ch); // complexity = O(n), space = O(1)
        //         freq[ch - 'a']++;
        //     }
        // }

        HashSet<Character> hs = new HashSet<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(!hs.contains(ch)){
                System.out.print(ch);
                hs.add(ch);
            }
        }

    }
}
