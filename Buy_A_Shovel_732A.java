package CodeForces;
import java.util.Scanner;

public class Buy_A_Shovel_732A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 1;
        while(true){
            int digit = (n*count) % 10;
            if(digit==0 || digit==m){
                System.out.println(count);
                break;
            }
            count++;
        }
    }
}
