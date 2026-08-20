package CodeForces;
import java.util.*;

public class Beautiful_Year_271A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        while(true){
            year++;
            int a = year%10;
            int b = (year/10)%10;
            int c = (year/100)%10;
            int d = year/1000;

            if(a!=b && a!=c && a!=d && b!=c && b!=d && c!=d){
                System.out.println(year);
                break;
            }
        }
    }
}
