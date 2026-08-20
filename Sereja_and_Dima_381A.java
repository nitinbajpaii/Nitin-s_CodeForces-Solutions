package CodeForces;

import java.util.*;

public class Sereja_and_Dima_381A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int sum1=0;
        int sum2=0;
        int l=0;
        int r = n-1;

        for(int i=0;i<n;i++){
            int x;
            if(arr[l]>arr[r]){
                x = arr[l];
                l++;
            }
            else{
                x = arr[r];
                r--;
            }
            if(i%2==0){
                sum1 += x;
            }
            else{
                sum2 += x;
            }
        }
        System.out.println(sum1 + " "+ sum2);
    }
}
