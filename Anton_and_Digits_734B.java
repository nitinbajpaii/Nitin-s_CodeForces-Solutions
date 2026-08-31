package CodeForces;

import java.util.Scanner;

public class Anton_and_Digits_734B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //2
        int b = sc.nextInt(); //3
        int c = sc.nextInt(); //5
        int d = sc.nextInt(); //6
        int pairs1 = Math.min(a,Math.min(c,d));
        int pairs2 = Math.min(b,a-pairs1);
        int ans = pairs1*256 + pairs2*32;
        System.out.println(ans);
    }
}
