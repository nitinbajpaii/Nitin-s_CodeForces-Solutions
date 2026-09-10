package CodeForces;

import java.util.Scanner;

public class Divisibility_Problem_1328A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int count = (b-(a%b))%b;
            System.out.println(count);
        }
    }
}
