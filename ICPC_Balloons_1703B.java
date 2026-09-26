package CodeForces;

import java.util.HashSet;
import java.util.Scanner;

public class ICPC_Balloons_1703B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String str = sc.next();
            int count=0;
            HashSet<Character> set = new HashSet<>();
            for(char ch: str.toCharArray()){
                if(set.contains(ch)){
                    count += 1;
                }
                else{
                    count += 2;
                }
                set.add(ch);
            }
            System.out.println(count);
        }
    }
}
