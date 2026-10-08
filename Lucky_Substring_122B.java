package CodeForces;

import java.util.Scanner;

public class Lucky_Substring_122B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count4=0;
        int count7=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='4'){
                count4++;
            }
            if(str.charAt(i)=='7'){
                count7++;
            }
        }
        if(count7>count4){
            System.out.println(7);
        }
        else if(count4>count7){
            System.out.println(4);
        }
        else if(count4!=0){
            System.out.println(4);
        }
        else{
            System.out.println(-1);
        }
    }
}
