package CodeForces;

import java.util.HashMap;
import java.util.Scanner;

public class Presents_136A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],i+1);
        }
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = map.get(i+1);
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
