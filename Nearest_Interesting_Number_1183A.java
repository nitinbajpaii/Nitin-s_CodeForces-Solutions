package CodeForces;

import java.util.Scanner;

public class Nearest_Interesting_Number_1183A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int req=0;
        while(true){
            int x = n+req;
            int sum=0;
            while(x!=0){
                sum += x%10;
                x /= 10;
            }
            if(sum%4==0){
                System.out.println(n+req);
                break;
            }
            req++;
        }
    }
}
