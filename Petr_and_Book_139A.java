package CodeForces;

import java.util.Scanner;

public class Petr_and_Book_139A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[7];
        for(int i=0;i<7;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        int sum=0;
        while(true){
            sum += arr[i];

            if(sum>=n){
                System.out.println(i+1);
                break;
            }
            i++;
            if(i==7){
                i=0;
            }
        }
    }
}
