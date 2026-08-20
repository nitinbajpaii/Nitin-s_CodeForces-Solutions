package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class Puzzles_337A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        for(int i=0;i<m;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<=m-n;i++){
            int diff = arr[n+i-1]-arr[i];
            min = Math.min(min,diff);
        }
        System.out.println(min);
    }
}
