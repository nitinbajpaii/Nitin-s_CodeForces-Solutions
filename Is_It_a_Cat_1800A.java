package CodeForces;
import java.util.Scanner;

public class Is_It_a_Cat_1800A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String str = sc.next().toLowerCase();
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<n;i++){
                if(i==0 || str.charAt(i)!=str.charAt(i-1)){
                    sb.append(str.charAt(i));
                }
            }

            if(sb.toString().equals("meow")){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}

