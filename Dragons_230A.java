package CodeForces;

import java.util.*;

public class Dragons_230A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();

        int[][] dragon = new int[n][2];
        for(int i=0;i<n;i++){
            dragon[i][0]= sc.nextInt();
            dragon[i][1] = sc.nextInt();
        }
        Arrays.sort(dragon,(a,b)-> a[0]-b[0]);
        for(int i=0;i<n;i++){
            if(s>dragon[i][0]){
                s += dragon[i][1];
            }
            else{
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
