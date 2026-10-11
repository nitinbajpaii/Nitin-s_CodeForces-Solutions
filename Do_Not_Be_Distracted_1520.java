package CodeForces;

import java.util.HashSet;
import java.util.Scanner;

public class Do_Not_Be_Distracted_1520 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String str = sc.next();
            HashSet<Character> set = new HashSet<>();
            boolean isValid=true;
            char prev=' ';
            for(char ch: str.toCharArray()){
                if(ch!=prev){
                    if(set.contains(ch)){
                        isValid=false;
                        break;
                    }
                    set.add(ch);
                }
                prev=ch;
            }
            if(isValid){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
