package CodeForces;
import java.util.*;

public class Elephant_617A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        int temp=n;
        int dig=temp/5;
        count=dig;
        int rem=temp%5;
        if(rem!=0){
            count++;
        }
        System.out.println(count);
    }
}
