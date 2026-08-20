package CodeForces;
import java.util.*;

public class Word_59A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int lower_count=0;
        int upper_count=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                upper_count++;
            }
            else{
                lower_count++;
            }
        }
        if(upper_count>lower_count){
            System.out.println(str.toUpperCase());
        }
        else{
            System.out.println(str.toLowerCase());
        }
    }
}
