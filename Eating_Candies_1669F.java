
package CodeForces;

import java.util.Scanner;

public class Eating_Candies_1669F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int left = 0;
            int right = n - 1;
            int leftSum = 0;
            int rightSum = 0;
            int maxCount = 0;
            while (left <= right) {
                if (leftSum <= rightSum) {
                    leftSum += arr[left];
                    left++;
                } else {
                    rightSum += arr[right];
                    right--;
                }
                if (leftSum == rightSum) {
                    maxCount = Math.max(maxCount, left + (n - 1 - right));
                }
            }
            System.out.println(maxCount);
        }
    }
}
