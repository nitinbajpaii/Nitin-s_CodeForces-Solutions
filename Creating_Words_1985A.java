package CodeForces;

import java.util.Scanner;

public class Creating_Words_1985A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String a = sc.next();
            String b = sc.next();
            StringBuilder s1 = new StringBuilder(a);
            StringBuilder s2 = new StringBuilder(b);
            char temp = s1.charAt(0);
            s1.setCharAt(0,s2.charAt(0));
            s2.setCharAt(0,temp);
            System.out.println(s1+" "+s2);

        }


    }
}
