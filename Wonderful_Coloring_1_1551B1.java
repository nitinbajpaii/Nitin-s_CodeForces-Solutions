package CodeForces;

import java.util.HashMap;
import java.util.Scanner;

public class Wonderful_Coloring_1_1551B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String str = sc.next();
            HashMap<Character,Integer> map = new HashMap<>();
            for(char ch: str.toCharArray()){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
            int count=0;
            for(char ch: map.keySet()){
                if(map.get(ch)==1){
                    count++;
                }
                else if(map.get(ch)>=2){
                    count += 2;
                }
            }
            System.out.println(count/2);
        }
    }
}
