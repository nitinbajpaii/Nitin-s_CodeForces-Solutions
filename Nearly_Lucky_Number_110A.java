package CodeForces;
import java.util.*;

public class Nearly_Lucky_Number_110A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        String str = sc.next();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='4' || str.charAt(i)=='7'){
                count++;
            }
        }
        if(count==4 || count==7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
