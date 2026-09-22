package CodeForces;

import java.util.Scanner;

public class Difference_Operations_1708A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            boolean possible = true;
            int first = arr[0];
            for(int i=1;i<n;i++){
                if(arr[i]%first!=0){
                    possible = false;
                    break;
                }
            }
            if(possible){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
