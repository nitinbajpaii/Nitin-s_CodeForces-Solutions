package CodeForces;

import java.util.Scanner;

public class Arrival_of_the_General_144A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int maxIndex=-1;
        int minIndex=-1;
        int max=Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<=min){
                min = arr[i];
                minIndex=i;
            }
            if(arr[i]>max){
                max=arr[i];
                maxIndex=i;
            }
        }
        int count = maxIndex + (n - 1 - minIndex);

        if(maxIndex > minIndex){
            count--;
        }
        System.out.println(count);
    }
}
