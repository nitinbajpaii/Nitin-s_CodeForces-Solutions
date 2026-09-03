package CodeForces;

import java.util.Scanner;

public class Love_Story_1829A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String match = "codeforces";
        while(n-->0){
            int count=0;
            String str = sc.next();
            for(int i=0;i<match.length();i++){
                if(str.charAt(i)!=match.charAt(i)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
