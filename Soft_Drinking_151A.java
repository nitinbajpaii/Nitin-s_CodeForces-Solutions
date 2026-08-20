package CodeForces;
import java.util.*;

public class Soft_Drinking_151A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();
        int total_drink = k*l;
        int t1 = total_drink/nl;
        int total_lime = c*d;
        int t2 = total_lime;
        int t3= p/np;
        int res = Math.min(t1,Math.min(t2,t3));
        System.out.println(res/n);
    }
}
