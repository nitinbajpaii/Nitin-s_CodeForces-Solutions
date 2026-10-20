package CodeForces;

import java.util.Scanner;

public class Trippi_Troppi_2094A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<3;i++){
                String str = sc.next();
                sb.append(str.charAt(0));
            }
            System.out.println(sb.toString());
        }
    }
}
