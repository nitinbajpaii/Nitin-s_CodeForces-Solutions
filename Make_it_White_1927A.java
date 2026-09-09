package CodeForces;

import java.util.*;

public class Make_it_White_1927A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String str = sc.next();
            int first = str.indexOf('B');
            int last = str.lastIndexOf('B');
            System.out.println(last-first+1);
        }
    }
}
