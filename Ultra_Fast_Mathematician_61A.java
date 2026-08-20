package CodeForces;

import java.util.Scanner;

public class Ultra_Fast_Mathematician_61A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s1.length();i++){
            sb.append((s1.charAt(i)-'0')^(s2.charAt(i)-'0'));
        }
        System.out.println(sb.toString());
    }
}
