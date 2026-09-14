package CodeForces;

import java.util.Scanner;

public class Panoramix_s_Prediction_80A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=n+1; i<=m; i++){
            if(isPrime(i)){
                System.out.println(i == m ? "YES" : "NO");
                return;
            }
        }
        System.out.println("NO");

    }
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        else{
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }
}
