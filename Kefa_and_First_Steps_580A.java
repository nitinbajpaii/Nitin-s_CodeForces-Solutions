package CodeForces;
import java.util.*;

public class Kefa_and_First_Steps_580A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int max = 1;
        int count=1;
        for(int i=1;i<n;i++){
            if(arr[i-1]<=arr[i]){
                count++;
            }
            else{
                count=1;
            }
            max = Math.max(count,max);
        }
        System.out.println(max);
    }
}
