package CodeForces;

import java.util.*;

public class Subsequence_Permutation_1552A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int count=0;
            String str = sc.next();
            char[] arr = str.toCharArray();
            char[] sorted = str.toCharArray();
            Arrays.sort(sorted);
            for(int i=0;i<n;i++){
                if(arr[i]!=sorted[i]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
