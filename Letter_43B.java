package CodeForces;

import java.util.*;

public class Letter_43B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();
        String text = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : sentence.toCharArray()){
            if(ch != ' '){
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        for(char ch : text.toCharArray()){
            if(ch == ' '){
                continue;
            }

            if(!map.containsKey(ch) || map.get(ch) == 0){
                System.out.println("NO");
                return;
            }

            map.put(ch, map.get(ch) - 1);
        }

        System.out.println("YES");
    }
}