package CodeForces;
import java.util.*;

public class I_Wanna_Be_the_Guy_469A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int[] arr1 = new int[p];
        for(int i=0;i<p;i++){
            arr1[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int[] arr2 = new int[q];
        for(int i=0;i<q;i++){
            arr2[i] = sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();
        for(int x: arr1){
            set.add(x);
        }
        for(int x: arr2){
            set.add(x);
        }
        if(set.size()==n){
            System.out.println("I become the guy.");
        }
        else{
            System.out.println("Oh, my keyboard!");
        }
    }
}
