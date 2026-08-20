package CodeForces;

import java.util.Scanner;

public class Queue_at_the_School_266B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String str = sc.next();
        char[] ch = str.toCharArray();
        while(t-->0){
            int i=0;
            while(i<n-1){
                if(ch[i]=='B'&&ch[i+1]=='G'){
                    char temp = ch[i];
                    ch[i]=ch[i+1];
                    ch[i+1]=temp;
                    i+=2;
                }
                else{
                    i++;
                }
            }
        }
        System.out.println(new String(ch));
    }
}
