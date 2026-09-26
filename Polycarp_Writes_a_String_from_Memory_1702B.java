package CodeForces;

import java.util.HashSet;
import java.util.Scanner;

public class Polycarp_Writes_a_String_from_Memory_1702B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String str = sc.next();
            int count=1;
            HashSet<Character> set = new HashSet<>();
            for(char ch: str.toCharArray()){
                if(set.size()==3 && !set.contains(ch)){
                    count++;
                    set.clear();
                }
                set.add(ch);
            }
            System.out.println(count);
        }
    }
}
