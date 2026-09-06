package CodeForces;

import java.util.Scanner;

public class Games_268A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        int[] home = new int[t];
        int[] away = new int[t];

        for(int i = 0; i < t; i++){
            home[i] = sc.nextInt();
            away[i] = sc.nextInt();
        }

        int count = 0;

        for(int i = 0; i < t; i++){
            for(int j = 0; j < t; j++){
                if(i != j && home[i] == away[j]){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}