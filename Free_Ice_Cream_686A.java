package CodeForces;
import java.util.*;

public class Free_Ice_Cream_686A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        int t = sc.nextInt();
        long ice_creams = sc.nextLong();
        while(t-->0){
            char ch = sc.next().charAt(0);
            long a = sc.nextLong();
            if(ch=='+'){
                ice_creams += a;
            }
            else if(ice_creams>=a){
                ice_creams -= a;
            }
            else{
                count++;
            }
        }
        System.out.println(ice_creams+" "+count);
    }
}
