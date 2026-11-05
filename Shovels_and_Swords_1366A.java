package CodeForces;

import java.util.Scanner;

public class Shovels_and_Swords_1366A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int ans = Math.min(Math.min(a, b), (a + b) / 3);
            System.out.println(ans);
        }

    }
}
