package CodeForces;

import java.util.Scanner;

public class Favorite_Sequence_1462A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int left=0;
            int right = n-1;
            while(left<right){
                System.out.print(arr[left]+" ");
                System.out.print(arr[right]+" ");
                left++;
                right--;
            }
            if(left==right){
                System.out.print(arr[left]);
            }
            System.out.println();
        }
    }
}
