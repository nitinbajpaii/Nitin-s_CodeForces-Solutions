package CodeForces;
import java.util.*;

public class Police_Recruits_427A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int officers=0;
        int untreated=0;
        for(int i=0;i<n;i++){
            if(arr[i]==-1){
                if(officers>0){
                    officers--;
                }
                else{
                    untreated++;
                }
            }
            else{
                officers += arr[i];
            }
        }
        System.out.println(untreated);
    }
}
