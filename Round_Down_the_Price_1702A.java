package CodeForces;

import java.util.Scanner;

public class Round_Down_the_Price_1702A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int num = sc.nextInt();
            String str = String.valueOf(num);
            int rounded = (int)(Math.pow(10,str.length()-1));
            int ans = Math.abs(num-rounded);
            System.out.println(ans);
        }
    }
}
