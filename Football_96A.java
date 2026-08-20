package CodeForces;
import java.util.*;

public class Football_96A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int one_count=0;
        int zero_count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                one_count++;
                zero_count=0;
            }
            else{
                zero_count++;
                one_count=0;
            }
            if(zero_count>=7 || one_count>=7){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
