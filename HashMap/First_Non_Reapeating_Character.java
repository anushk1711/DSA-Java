import java.util.*;

public class First_Non_Reapeating_Character {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        boolean found = false;

        HashMap<Character, Integer> map = new HashMap<>();

        for (char cha : ch) {
            if (map.containsKey(cha)) {
                map.put(cha, map.get(cha) + 1);
            } else {
                map.put(cha, 1);
            }
        }

        for (char key : ch) {
            if (map.get(key) == 1) {
                found = true;
                System.out.println(key);
                break;
            }
        }
        if (!found) {
            System.out.println("Not Found");
        }
    }
}
