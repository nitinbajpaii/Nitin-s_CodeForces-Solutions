package CodeForces;

import java.util.Scanner;

public class Dubstep_208A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] words = str.trim().split("WUB");
        StringBuilder sb = new StringBuilder();
        for(String word: words){
            if(!word.isEmpty()){
                sb.append(word);
                sb.append(" ");
            }
        }
        System.out.println(sb.toString().trim());
    }
}
