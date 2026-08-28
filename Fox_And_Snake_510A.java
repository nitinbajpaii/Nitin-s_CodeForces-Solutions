package CodeForces;

import java.util.Scanner;

public class Fox_And_Snake_510A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] matrix = new char[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i%2==0){
                    matrix[i][j]='#';
                }
                else if (i%4==1 && j==m-1){
                    matrix[i][j]= '#';
                }
                else if (i%4==3 && j==0){
                    matrix[i][j]='#';
                }
                else{
                    matrix[i][j] ='.';
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
