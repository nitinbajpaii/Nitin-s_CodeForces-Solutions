package CodeForces;

import java.util.HashMap;
import java.util.Scanner;

public class Boats_Competition_1399C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int x:arr){
                map.put(x,map.getOrDefault(x,0)+1);
            }
            int max = 0;
            for(int sum=2;sum<=2*n;sum++){
                int count = 0;
                for(int x: map.keySet()){
                    int partner = sum-x;
                    if(!map.containsKey(partner)){
                        continue;
                    }
                    if(x > partner){
                        continue;
                    }
                    if(x==partner){
                        count += map.get(x)/2;
                    }
                    else{
                        count += Math.min(map.get(x),map.get(partner));
                    }
                }
                max = Math.max(count,max);
            }
            System.out.println(max);
        }
    }
}
