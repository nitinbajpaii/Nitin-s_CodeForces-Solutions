package CodeForces;

import java.util.*;

public class Anton_and_Letters_443A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        for(char ch: str.toCharArray()){
            if(ch>='a'&&ch<='z'){
                set.add(ch);
            }
        }
        System.out.println(set.size());
    }
}
