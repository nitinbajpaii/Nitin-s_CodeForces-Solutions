package CodeForces;

import java.util.Scanner;

public class Short_Substrings_1367A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            StringBuilder sb = new StringBuilder();
            String str = sc.next();
            for(int i=0;i<str.length();i+=2){
                    sb.append(str.charAt(i));
            }
            sb.append(str.charAt(str.length()-1));
            System.out.println(sb.toString());

        }
    }
}
