package CodeForces;

import java.util.Scanner;

public class Two_Substrings_550A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int ab = str.indexOf("AB");
        int ba = str.indexOf("BA");

        if(ab!=-1 && ba!=-1){
            if(str.indexOf("BA",ab+2)!=-1 || str.indexOf("AB",ba+2)!=-1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        else{
            System.out.println("NO");
        }
    }
}
