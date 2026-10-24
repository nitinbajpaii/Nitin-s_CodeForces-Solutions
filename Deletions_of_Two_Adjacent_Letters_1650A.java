package CodeForces;

import java.util.Scanner;

public class Deletions_of_Two_Adjacent_Letters_1650A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            char ch = sc.next().charAt(0);
            boolean isFound = false;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==ch && (i+1)%2!=0){
                    isFound=true;
                    break;
                }
            }
            if(isFound){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
