package CodeForces;
import java.util.*;

public class Helpful_Maths_339A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder();
        String[] arr = str.split("\\+");
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
            if(i!=arr.length-1){
                sb.append("+");
            }
        }
        System.out.println(sb.toString());
    }
}
