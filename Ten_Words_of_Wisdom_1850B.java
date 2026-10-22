package CodeForces;

import java.util.Scanner;

public class Ten_Words_of_Wisdom_1850B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int max = 0;
            int maxIndex=0;
            for(int i=1;i<=n;i++){
                int a = sc.nextInt();
                int b = sc.nextInt();

                if(a<=10 && b>max){
                    max=b;
                    maxIndex=i;
                }
            }
            System.out.println(maxIndex);
        }
    }
}
