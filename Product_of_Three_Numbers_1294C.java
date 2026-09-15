package CodeForces;

import java.util.Scanner;

public class Product_of_Three_Numbers_1294C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a = -1;
            int b = -1;
            int c = -1;
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    a =i;
                    n = n/i;
                    break;
                }
            }
            if(a!=-1) {
                for (int i = a + 1; i * i <= n; i++) {
                    if (n % i == 0) {
                        b = i;
                        n = n / i;
                        break;
                    }
                }
            }
            c=n;
            if(a!=-1 && b!=-1 && c>1 && a!=b && b!=c && a!=c){
                System.out.println("YES");
                System.out.println(a+" "+b+" "+c);
            }
            else{
                System.out.println("NO");
            }
        }

    }
}
