package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class Less_or_Equal_977C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int ans = -1;

        if (k == 0) {
            ans = arr[0] - 1;

            if (ans < 1) {
                ans = -1;
            }
        }
        else {
            ans = arr[k - 1];

            if (k < n && arr[k] == arr[k - 1]) {
                ans = -1;
            }
        }

        System.out.println(ans);
    }
}