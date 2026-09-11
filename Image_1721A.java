package CodeForces;

import java.util.*;

public class Image_1721A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            HashSet<Character> set = new HashSet<>();
            String s1 = sc.next();
            String s2 = sc.next();
            for(char ch: s1.toCharArray()){
                set.add(ch);
            }
            for(char ch: s2.toCharArray()){
                set.add(ch);
            }
            System.out.println(set.size()-1);
        }
    }
}
