package CodeForces;
import java.util.*;

public class cAPS_lOCK_131A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean ok = true;
        for(int i=1;i<str.length();i++){
            if(Character.isLowerCase(str.charAt(i))){
                ok = false;
                break;
            }
        }
        if(ok){
            StringBuilder ans = new StringBuilder();
            for(char ch: str.toCharArray()){
                if(Character.isUpperCase(ch)){
                    ans.append(Character.toLowerCase(ch));
                }
                else{
                    ans.append(Character.toUpperCase(ch));
                }
            }
            System.out.println(ans);
        }
        else{
            System.out.println(str);
        }
    }
}
