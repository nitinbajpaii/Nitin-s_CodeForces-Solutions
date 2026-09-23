package CodeForces;

import java.util.*;

public class My_First_Sorting_Problem_1971A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int[] arr = new int[2];
            for(int i=0;i<2;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            for(int i=0;i<2;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
