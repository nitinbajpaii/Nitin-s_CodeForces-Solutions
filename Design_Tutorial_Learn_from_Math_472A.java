package CodeForces;
import java.util.*;

public class Design_Tutorial_Learn_from_Math_472A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int a=4;a<n;a++){
            int b = n-a;
            if(!isPrime(a)&&!isPrime(b)){
                System.out.println(a+" "+b);
                break;
            }
        }
    }
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
