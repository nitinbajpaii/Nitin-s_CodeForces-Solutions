package CodeForces;

import java.util.Scanner;

public class Erasing_Zeroes_1303A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String str = sc.next();
            int count=0;
            int first = str.indexOf('1');
            int last = str.lastIndexOf('1');

            if(first==-1){
                System.out.println(0);
                continue;
            }
            for(int i=first;i<=last;i++){
                if(str.charAt(i)=='0'){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
