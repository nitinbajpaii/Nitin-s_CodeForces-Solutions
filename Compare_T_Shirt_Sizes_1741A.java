package CodeForces;

import java.util.Scanner;

public class Compare_T_Shirt_Sizes_1741A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String a = sc.next();
            String b = sc.next();
            char x = a.charAt(a.length() - 1);
            char y = b.charAt(b.length() - 1);

            if (x == y) {
                if (x == 'S') {
                    if (a.length() > b.length())
                        System.out.println("<");
                    else if (a.length() < b.length())
                        System.out.println(">");
                    else
                        System.out.println("=");
                }
                else if (x == 'L') {
                    if (a.length() > b.length())
                        System.out.println(">");
                    else if (a.length() < b.length())
                        System.out.println("<");
                    else
                        System.out.println("=");
                }
                else {
                    System.out.println("=");
                }
            }
            else {
                if (x == 'S' || y == 'L')
                    System.out.println("<");
                else
                    System.out.println(">");
            }
        }
    }
}
