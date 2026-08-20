package CodeForces;
import java.util.*;

public class Twins_160A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            totalSum += arr[i];
        }
        Arrays.sort(arr);

        int mySum = 0;
        int count = 0;

        for (int i = n - 1; i >= 0; i--) {
            mySum += arr[i];
            count++;

            if (mySum > totalSum - mySum) {
                System.out.println(count);
                return;
            }
        }
    }
}