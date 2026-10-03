package CodeForces;

import java.util.HashMap;
import java.util.Scanner;

public class Juggling_Letters_1397A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            HashMap<Character,Integer>map = new HashMap<>();
            for(int i=0;i<n;i++){
                String str = sc.next();
                for(char ch: str.toCharArray()){
                    map.put(ch,map.getOrDefault(ch,0)+1);
                }
            }
            boolean possible = true;
            for(char ch:map.keySet()){
                if(map.get(ch)%n!=0){
                    possible = false;
                }
            }

            if(possible){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
