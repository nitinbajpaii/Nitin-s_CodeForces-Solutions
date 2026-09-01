package CodeForces;

import java.util.*;

public class Amusing_Joke_141A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();
        String res = str1+str2;

        char[] arr1 = res.toCharArray();
        char[] arr2 = str3.toCharArray();

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
