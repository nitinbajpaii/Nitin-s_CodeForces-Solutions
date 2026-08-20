package CodeForces;
import java.util.*;

public class Expression_479A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int case1 = a+b*c;
        int case2 = a*(b+c);
        int case3 = a*b*c;
        int case4 = (a+b)*c;
        int case5 = a+b+c;
        int case6 = a*b+c;
        int ans = Math.max(case1, case2);
        ans = Math.max(ans, case3);
        ans = Math.max(ans, case4);
        ans = Math.max(ans, case5);
        ans = Math.max(ans, case6);
        System.out.println(ans);
    }
}
