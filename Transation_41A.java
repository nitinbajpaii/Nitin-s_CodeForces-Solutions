package CodeForces;
import java.util.*;

public class Transation_41A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String sb = new StringBuilder(str1).reverse().toString();
        if(sb.equals(str2)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
