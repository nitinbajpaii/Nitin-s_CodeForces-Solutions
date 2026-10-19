
package CodeForces;

import java.util.HashSet;
import java.util.Scanner;

public class New_Palindrome_1832A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String str = sc.next();
            int n = str.length();

            HashSet<Character> set = new HashSet<>();

            for (int i = 0; i < n / 2; i++) {
                set.add(str.charAt(i));
            }

            if (set.size() >= 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
