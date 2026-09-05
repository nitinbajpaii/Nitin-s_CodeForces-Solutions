package CodeForces;

import java.util.*;

public class Remove_Duplicates_978A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=n-1;i>=0;i--){
            if(!set.contains(arr[i])){
                list.add(arr[i]);
            }
            set.add(arr[i]);
        }
        Collections.reverse(list);
        System.out.println(list.size());
        for(int num: list){
            System.out.print(num+" ");
        }
    }
}
