package CodeForces;
import java.util.*;

public class Pangram_520A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        str = str.toLowerCase();
        int freq[] = new int[26];
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            freq[ch-'a']++;
        }
        boolean pangram = true;
        for(int i=0;i<26;i++){
            if(freq[i]==0){
                pangram = false;
                break;
            }
        }
        if(pangram){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
