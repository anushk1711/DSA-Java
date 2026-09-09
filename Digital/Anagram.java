import java.util.*;

public class Anagram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        char[] ch1 = str1.toCharArray();
        String str2 = sc.nextLine();
        char[] ch2 = str2.toCharArray();

        if(str1.length() != str2.length()){
            System.out.print(false);
            return;
        }

        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(Character ch : ch1){
            if(map1.containsKey(ch)){
                map1.put(ch, map1.get(ch)+1);
            }
            else{
                map1.put(ch,1);
            }
        }

        for(Character ch : ch2){
            if(map2.containsKey(ch)){
                map2.put(ch, map2.get(ch)+1);
            }else{
                map2.put(ch,1);
            }
        }

        System.out.print(map1.equals(map2));
    }
}