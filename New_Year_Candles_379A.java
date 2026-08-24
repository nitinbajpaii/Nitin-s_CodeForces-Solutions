package CodeForces;

import java.util.Scanner;

public class New_Year_Candles_379A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count=n;
        while(n>=m){
            int newCandles = n/m;
            count += newCandles;
            n = newCandles + (n%m);
        }
        System.out.println(count);
    }
}
