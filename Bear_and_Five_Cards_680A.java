package CodeForces;

import java.util.HashMap;
import java.util.Scanner;

public class Bear_and_Five_Cards_680A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int sum=0;
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x: arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int maxRemove=0;
        for(int x: map.keySet()){
            int freq = map.get(x);
            if(freq>=2){
                int remove = x * Math.min(freq,3);
                maxRemove = Math.max(maxRemove,remove);
            }
        }
        System.out.println(sum-maxRemove);
    }
}
