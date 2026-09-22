package CodeForces;

import java.util.Scanner;

public class Square_String_1619 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String str = sc.next();
            int n = str.length();
            if(n%2!=0){
                System.out.println("NO");
            }
            else{
                String s1 = str.substring(0,n/2);
                String s2 = str.substring(n/2,n);
                if(s1.equals(s2)){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
}
