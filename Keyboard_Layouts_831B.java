package CodeForces;

import java.util.HashMap;
import java.util.Scanner;

public class Keyboard_Layouts_831B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        HashMap<Character,Character> map = new HashMap<>();
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        for(int i=0;i<26;i++){
            map.put(arr1[i],arr2[i]);
        }
        StringBuilder sb = new StringBuilder();
        char[] arr3 = s3.toCharArray();
        for(char ch: arr3){
            if(Character.isLowerCase(ch)){
                sb.append(map.get(ch));
            }
            else if(Character.isUpperCase(ch)){
                sb.append(Character.toUpperCase(map.get(Character.toLowerCase(ch))));
            }
            else{
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}
