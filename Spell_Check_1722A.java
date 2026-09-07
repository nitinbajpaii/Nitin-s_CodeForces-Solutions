package CodeForces;
import java.util.*;

public class Spell_Check_1722A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        String res = "Timur";
        char[] arr1 = res.toCharArray();
        Arrays.sort(arr1);
        while(t-->0){
            int n = sc.nextInt();
            String str = sc.next();
            char[] arr2 = str.toCharArray();
            Arrays.sort(arr2);
            if(Arrays.equals(arr1,arr2)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

    }
}
