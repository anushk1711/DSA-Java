import java.util.*;

public class Longest_Subarray_WithSumLessthanEqlK {

    public static void main(String[] args) {

        int n = 5;
        int[] arr = {2, -1, 3, -2, 4};
        int k = 5;

        int[] prefix = new int[n + 1];

        // Build prefix sum
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }

        // Build prefix maximum
        int[] prefixMax = new int[n + 1];
        prefixMax[0] = prefix[0];

        for (int i = 1; i <= n; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], prefix[i]);
        }

        int maxLen = 0;

        for (int i = 0; i <= n; i++) {

            int target = prefix[i] - k;

            // Binary search: first prefixMax[j] >= target
            int left = 0;
            int right = i;

            while (left <= right) {

                int mid = left + (right - left) / 2;

                if (prefixMax[mid] >= target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            // left is the earliest valid j
            if (left <= i) {
                int len = i - left;
                maxLen = Math.max(maxLen, len);
            }
        }

        System.out.println(maxLen);
    }
}