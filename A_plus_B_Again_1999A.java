package CodeForces;

import java.util.Scanner;

public class A_plus_B_Again_1999A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long sum=0;
            while (n!=0){
                int digit = n % 10;
                sum += digit;
                n /= 10;
            }
            System.out.println(sum);
        }
    }
}
