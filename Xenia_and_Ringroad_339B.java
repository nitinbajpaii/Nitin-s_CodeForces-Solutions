package CodeForces;

import java.util.Scanner;

public class Xenia_and_Ringroad_339B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        for(int i=0;i<m;i++){
            arr[i]=sc.nextInt();
        }
        long totalDistance=0;
        int current =1;
        for(int i=0;i<m;i++){
            if(arr[i]>=current){
                totalDistance += arr[i]-current;
            }
            else{
                totalDistance += (long)(n-current)+arr[i];
            }
            current=arr[i];
        }
        System.out.println(totalDistance);
    }
}
