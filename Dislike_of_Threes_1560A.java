package CodeForces;

import java.util.Scanner;

public class Dislike_of_Threes_1560A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[1001];
        int count=0;
        for(int i=1;count<1000;i++){
            if(i%3!=0 && i%10!=3){
                count++;
                arr[count] =i;
            }
        }
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            System.out.println(arr[n]);
        }
    }
}
