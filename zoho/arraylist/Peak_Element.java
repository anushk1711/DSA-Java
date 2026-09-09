
import java.util.Scanner;

public class Peak_Element {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int peak_index = -1;
        for (int i = 0; i < n; i++) {
            boolean leftCheck = (i == 0 || arr[i] > arr[i - 1]);
            boolean rightCheck = (i == n - 1 || arr[i] > arr[i + 1]);

            if (leftCheck && rightCheck) {
                peak_index = i;
                break;
            }
        }
        if (peak_index != -1) {
            System.out.println(peak_index);//returns index of value which is peak element(which is greater than it neigbors)
        } else {
            System.out.println("No peak Elements found");
        }

    }
}
