package CodeForces;

import java.util.Scanner;

public class Grass_Field_1701A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int[][] arr = new int[2][2];
            for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            int count1=0;
            for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    if(arr[i][j]==1){
                        count1++;
                    }
                }
            }
            if(count1==0){
                System.out.println(0);
            }
            else if(count1==4){
                System.out.println(2);
            }
            else{
                System.out.println(1);
            }
        }
    }
}
