package CodeForces;

import java.util.*;

public class Your_Name_2167B {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s1 = sc.next();
            String s2 = sc.next();
            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();
            Arrays.sort(arr1);
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
