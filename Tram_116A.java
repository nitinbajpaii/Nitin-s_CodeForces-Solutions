package CodeForces;
import java.util.*;

public class Tram_116A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max =0;
        int curr =0;
        while(n-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            curr = curr -a + b;
            max = Math.max(max,curr);
        }
        System.out.println(max);
    }
}
