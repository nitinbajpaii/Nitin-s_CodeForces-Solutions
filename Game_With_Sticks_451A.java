package CodeForces;

import java.util.Scanner;

public class Game_With_Sticks_451A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int res = Math.min(n,m);
        if(res%2==1){
            System.out.println("Akshat");
        }
        else{
            System.out.println("Malvika");
        }
    }
}
