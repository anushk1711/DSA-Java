import java.util.*;

public class FrequencyOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int max = 0;

        HashMap<String, Integer> map = new HashMap<>();
        String[] split = str.split(" ");

        for (String word : split) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }

        }
        for (String key : map.keySet()) {
            max = Math.max(max, map.get(key));
        }
        System.out.println(map);

        System.out.println(max);

    }
}
