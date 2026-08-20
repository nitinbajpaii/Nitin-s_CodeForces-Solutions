package CodeForces;
import java.util.*;

public class T_primes_230B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        for(int i=0;i<n;i++){
            if(countFactors(arr[i])){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    public static boolean countFactors(long n){
        long root = (long)Math.sqrt(n);
        if(root*root!=n){
            return false;
        }
        for(long i=2;i*i<=root;i++){
            if(root%i==0){
                return false;
            }
        }
        return root>1;
    }
}
