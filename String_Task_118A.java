package CodeForces;

import java.util.Scanner;

public class String_Task_118A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++) {
            if (!isVowel(str.charAt(i))) {
                sb.append(".");
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
    public static boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='y';
    }
}
