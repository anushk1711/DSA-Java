import java.util.Scanner;

class MinimumDistanceBetWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String w1 = sc.nextLine();
        String w2 = sc.nextLine();

        String[] arr = str.split(" ");

        int min = Integer.MAX_VALUE;

        if (w1.equals(w2)) {

            int prev = -1;

            for (int i = 0; i < arr.length; i++) {

                if (arr[i].equals(w1)) {

                    if (prev != -1) {
                        min = Math.min(min, i - prev);
                    }

                    prev = i;
                }
            }

        } else {

            int pos1 = -1;
            int pos2 = -1;

            for (int i = 0; i < arr.length; i++) {

                if (arr[i].equals(w1)) {
                    pos1 = i;
                }

                if (arr[i].equals(w2)) {
                    pos2 = i;
                }

                if (pos1 != -1 && pos2 != -1) {
                    min = Math.min(min, Math.abs(pos1 - pos2));
                }
            }
        }

        System.out.println(min);
    }
}