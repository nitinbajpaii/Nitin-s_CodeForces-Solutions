package CodeForces;

import java.util.Scanner;

public class Codeforces_Checking_1791A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String str = "codeforces";
        while(t-->0){
            String s = sc.next();
            if(str.contains(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
