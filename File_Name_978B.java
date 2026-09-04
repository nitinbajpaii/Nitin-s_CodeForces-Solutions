package CodeForces;

import java.util.Scanner;

public class File_Name_978B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int count=0;
        int count2=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='x'){
                count++;
                if(count>2){
                    count2++;
                }
            }
            else{
                count=0;
            }
        }
        System.out.println(count2);
    }
}
