package CodeForces;

import java.util.Scanner;

public class Stone_Game_1538A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int minIndex =-1;
            int maxIndex =-1;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                if(arr[i]<min){
                    min = arr[i];
                    minIndex=i;
                }
                if(arr[i]>max){
                    max = arr[i];
                    maxIndex=i;
                }
            }
            int bothLeft = Math.max(minIndex,maxIndex)+1;
            int bothRight = n- Math.min(minIndex,maxIndex);
            int oneLeftOneRight = Math.min(minIndex,maxIndex)+1 + n-Math.max(minIndex,maxIndex);
            int ans = Math.min(bothLeft,Math.min(bothRight,oneLeftOneRight));
            System.out.println(ans);
        }
    }
}
