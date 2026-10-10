package CodeForces;

import java.util.Scanner;

public class Compote_746A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lemons = sc.nextInt();
        int apples = sc.nextInt();
        int pears = sc.nextInt();

        int lemonsCompote = lemons;
        int appleCompote = apples/2;
        int pearsCompote = pears/4;
        int max = Math.min(lemonsCompote,Math.min(appleCompote,pearsCompote));
        System.out.println(max*7);
    }
}
