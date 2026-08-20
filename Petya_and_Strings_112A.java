package CodeForces;
import java.util.*;

public class Petya_and_Strings_112A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        str1 = str1.toLowerCase();
        str2=str2.toLowerCase();

        int res = str1.compareTo(str2);
        if(res<0){
            System.out.println(-1);
        }
        else if (res>0){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
