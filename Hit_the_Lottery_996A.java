package CodeForces;

import java.util.Scanner;

public class Hit_the_Lottery_996A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
            while (n >= 100) {
                count++;
                n -= 100;
            }
            while (n >= 20) {
                count++;
                n -= 20;
            }
            while (n >= 10) {
                count++;
                n -= 10;
            }
            while (n >= 5) {
                count++;
                n -= 5;
            }
            while (n >= 1) {
                count++;
                n -= 1;
            }
        System.out.println(count);
    }
}
