package CodeForces;

import java.util.Scanner;

public class Fair_Division_1472B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int sum=0;
            int count1=0;
            int count2=0;
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            for(int i=0;i<n;i++){
                if(arr[i]==1){
                    count1++;
                }
                else{
                    count2++;
                }
            }

            if (sum % 2 != 0) {
                System.out.println("NO");
            } else if (count1 % 2 == 0 && (count1 > 0 || count2 % 2 == 0)) {
                System.out.println("YES");
            } else if (count1 % 2 != 0 && count2 % 2 != 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
