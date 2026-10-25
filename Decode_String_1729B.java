package CodeForces;
import java.util.Scanner;

public class Decode_String_1729B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String str = sc.next();
            String res ="";
            for(int i=str.length()-1;i>=0;){
                if(str.charAt(i)=='0'){
                    int num = (str.charAt(i-2)-'0') * 10 + (str.charAt(i-1)-'0');
                    char ch = (char) ('a'+num-1);
                    res += ch;
                    i -= 3;
                }
                else{
                    int num = str.charAt(i)-'0';
                    char ch = (char) ('a'+num-1);
                    res += ch;
                    i--;
                }
            }
            String rev = new StringBuilder(res).reverse().toString();
            System.out.println(rev);
        }
    }
}
