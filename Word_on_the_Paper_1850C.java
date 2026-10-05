package CodeForces;
import java.util.Scanner;

public class Word_on_the_Paper_1850C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < 8; i++){
                String row = sc.next();

                for(int j = 0; j < 8; j++){
                    if(row.charAt(j) != '.'){
                        sb.append(row.charAt(j));
                    }
                }
            }

            System.out.println(sb);
        }
    }
}