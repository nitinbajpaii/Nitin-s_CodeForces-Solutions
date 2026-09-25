package CodeForces;

import java.util.Scanner;

public class Colourblindness_1722B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String str1 = sc.next();
            String str2 = sc.next();
            boolean isTrue = true;
            for(int i=0;i<n;i++){
                char a = str1.charAt(i);
                char b = str2.charAt(i);

                if(!(a == b || (a == 'G' && b == 'B') || (a == 'B' && b == 'G'))){
                    isTrue = false;
                    break;
                }
            }
            if(isTrue){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
