package CodeForces;

import java.util.Scanner;

public class Ordinary_Numbers_1520B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int count=0;

            for(int digit=1;digit<=9;digit++){
                long num = 0;

                while(num<=n){
                    num = num*10+digit;

                    if(num<=n){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
