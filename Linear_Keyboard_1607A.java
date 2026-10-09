package CodeForces;

import java.util.ArrayList;
import java.util.Scanner;

public class Linear_Keyboard_1607A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            ArrayList<Integer> arr = new ArrayList<>();
            String str1 = sc.next();
            String str2 = sc.next();
            for(char ch: str2.toCharArray()){
                int index = str1.indexOf(ch)+1;
                arr.add(index);
            }
            int sum=0;
            for(int i=0;i<arr.size()-1;i++){
                sum += Math.abs(arr.get(i+1)-arr.get(i));
            }
            System.out.println(sum);
        }
    }
}
