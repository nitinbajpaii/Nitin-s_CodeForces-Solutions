package CodeForces;

import java.util.Scanner;

public class Gifts_Fixing_1399B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr1 = new int[n];
            int[] arr2 = new int[n];
            for(int i=0;i<n;i++){
                arr1[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                arr2[i]=sc.nextInt();
            }
            int min1 = Integer.MAX_VALUE;
            int min2 = Integer.MAX_VALUE;
            for(int x: arr1){
                if(x<min1){
                    min1 = x;
                }
            }
            for(int x: arr2){
                if(x<min2){
                    min2 = x;
                }
            }
            long ans =0;
            for(int i=0;i<n;i++){
                int diff1 = arr1[i]-min1;
                int diff2 = arr2[i]-min2;

                ans += Math.max(diff1,diff2);

            }
            System.out.println(ans);
        }
    }
}
