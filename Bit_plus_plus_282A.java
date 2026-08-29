package CodeForces;

import java.util.Scanner;

public class Bit_plus_plus_282A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x=0;
        while(n-->0){
            String ch = sc.next();
            if(ch.equals("X++")||ch.equals("++X")){
                x++;
            }
            else{
                x--;
            }
        }
        System.out.println(x);
    }
}
