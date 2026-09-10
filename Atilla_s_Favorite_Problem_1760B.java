package CodeForces;

import java.util.Scanner;

public class Atilla_s_Favorite_Problem_1760B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String str = sc.next();
            int max = 0;
            for(int i=0;i<n;i++){
                max = Math.max(str.charAt(i)-'a'+1,max);
            }
            System.out.println(max);
        }
    }
}
