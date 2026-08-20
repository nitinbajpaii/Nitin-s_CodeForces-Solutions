package CodeForces;

import java.util.*;

public class Beautiful_Matrix_263A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row =0,col=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                int x = sc.nextInt();
                if(x==1){
                    row=i;
                    col=j;
                }
            }
        }
        System.out.print(Math.abs(row-2)+Math.abs(col-2));
    }
}
