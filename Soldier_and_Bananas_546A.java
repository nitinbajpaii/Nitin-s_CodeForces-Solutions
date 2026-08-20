package CodeForces;
import java.util.*;

public class Soldier_and_Bananas_546A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int sum=0;
        for(int i=1;i<=w;i++){
            sum += i*k;
        }
        System.out.println(Math.max(0,sum-n));
    }
}
