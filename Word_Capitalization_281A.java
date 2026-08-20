package CodeForces;
import java.util.*;

public class Word_Capitalization_281A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char ch = str.charAt(0);
        if(Character.isLowerCase(ch)){
            ch = Character.toUpperCase(ch);
        }
        str = ch + str.substring(1);
        System.out.println(str);
    }
}
