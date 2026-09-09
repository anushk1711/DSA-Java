import java.util.*;

public class FrequencyOfCharacter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        int max = 0;
        char maxchar = ' ';


        HashMap<Character,Integer> map = new HashMap<>();

        for(char cha : ch){
            if(map.containsKey(cha)){
                map.put(cha, map.get(cha)+1);
            }else{
                map.put(cha,1);
            }
            // if(map.get(cha) > max){
            //     max = map.get(cha);
            // }

            // OR
            max = Math.max(max,map.get(cha));//prints maximum frequency of character in a string
            maxchar = (char) Math.max(maxchar, cha); // prints character with highest ascii value.
            
        }

        System.out.println(map);//prints number of occurance of each character 
        System.out.println(max);//prints maximum repeated charactere in value
        System.out.println(maxchar);//prints character with maximum ascii value.

    }
}