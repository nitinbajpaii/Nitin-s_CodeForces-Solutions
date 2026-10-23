package CodeForces;

import java.util.Scanner;

public class Polycarp_and_the_Day_of_Pi_1790A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String res = "314159265358979323846264338327";
        while(t-->0){
            String s = sc.next();
            int count=0;
            for(int i=0;i<s.length() ;i++){
                char ch = s.charAt(i);
                if(ch==res.charAt(i)){
                    count++;
                }
                else{
                    break;
                }
            }
            System.out.println(count);
        }
    }
}
