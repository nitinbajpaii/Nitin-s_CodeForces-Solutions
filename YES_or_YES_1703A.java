package CodeForces;

import java.util.Scanner;

public class YES_or_YES_1703A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            String str = sc.next().toUpperCase();
            if(str.equals("YES")){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
