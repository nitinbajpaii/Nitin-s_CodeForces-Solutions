package CodeForces;

import java.util.Scanner;

public class Two_Elevators_1729A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int firstTime = a-1;
            int secondTime = Math.abs(b-c)+(c-1);
            if(firstTime < secondTime) {
                System.out.println(1);
            }
            else if(secondTime < firstTime) {
                System.out.println(2);
            }
            else {
                System.out.println(3);
            }
        }
    }
}
