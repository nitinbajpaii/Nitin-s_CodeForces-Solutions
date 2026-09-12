package CodeForces;

import java.util.*;

public class Interesting_drink_706B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int count=0;
            int start=0;
            int end = n-1;
            while(start<=end){
                int mid = start+(end-start)/2;
                if(arr[mid]<=x){
                    count = mid+1;
                    start=mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            System.out.println(count);
        }
    }
}
