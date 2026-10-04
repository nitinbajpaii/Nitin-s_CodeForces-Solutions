package CodeForces;

import java.util.HashMap;
import java.util.Scanner;

public class Two_gram_977B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<n-1;i++){
            String s = str.substring(i,i+2);
            map.put(s,map.getOrDefault(s,0)+1);
        }
        int max = Integer.MIN_VALUE;
        String ans ="";
        for(String s: map.keySet()){
            if(map.get(s)>max){
                max = map.get(s);
                ans = s;
            }
        }
        System.out.println(ans);
    }
}
