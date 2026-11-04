package CodeForces;

import java.util.HashSet;
import java.util.Scanner;

public class Musical_Puzzle_1833A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String str = sc.next();
            HashSet<String> set = new HashSet<>();
            for(int i=0;i<n-1;i++){
                String s = str.substring(i,i+2);
                set.add(s);
            }
            System.out.println(set.size());
        }
    }
}
