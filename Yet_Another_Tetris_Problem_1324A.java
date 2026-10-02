package CodeForces;

import java.util.Scanner;

public class Yet_Another_Tetris_Problem_1324A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int res = arr[0]%2;
            boolean isEven = true;
            for(int i=1;i<n;i++){
                if(arr[i]%2!=res){
                    isEven = false;
                }
            }
            if(isEven){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
