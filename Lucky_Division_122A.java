package CodeForces;

import java.util.Scanner;

public class Lucky_Division_122A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] lucky = {4,7,44,77,47,74,444,777,474,744,447,774,477,747};
        for(int x: lucky){
            if(n%x==0){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
