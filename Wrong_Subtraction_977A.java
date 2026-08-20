package CodeForces;
import java.util.*;

public class Wrong_Subtraction_977A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        while(k--!=0){
            int digit = n%10;
            if(digit!=0){
                n -= 1;
            }
            else {
                n /= 10;
            }
        }
        System.out.print(n);
    }
}
