package CodeForces;
import java.util.*;

public class George_and_Accommodation_467A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        while(n-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(b-a>=2){
                count++;
            }
        }
        System.out.println(count);
    }
}
