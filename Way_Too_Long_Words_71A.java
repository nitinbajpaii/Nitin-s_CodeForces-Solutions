package CodeForces;
import java.util.*;

public class Way_Too_Long_Words_71A {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t=sc.nextInt();
        while(t-->0) {
            String str = sc.next();
            String res = "";
            int len = str.length();
            if(str.length()<=10){
                System.out.println(str);
            }
            else{
                int ans = len - 2;
                char first = str.charAt(0);
                char last = str.charAt(str.length() - 1);
                res += "" + first + ans + last;
                System.out.println(res);
            }
        }
    }
}

