package CodeForces;
import java.util.*;

public class Is_your_horseshoe_on_the_other_hoof_228A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        int n = 4;
        while(n-->0){
            int x = sc.nextInt();
            set.add(x);
        }
        System.out.println(4-set.size());
    }
}
