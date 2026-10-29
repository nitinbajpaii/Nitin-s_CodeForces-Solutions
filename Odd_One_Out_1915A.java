package CodeForces;

import java.util.Scanner;

public class Odd_One_Out_1915A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int[] arr = new int[3];
            for (int i = 0; i < 3; i++) {
                arr[i] = sc.nextInt();
            }
            int ans = 0;
            for (int i = 0; i < 3; i++) {
                ans ^= arr[i];
            }
            System.out.println(ans);
        }
    }
}
