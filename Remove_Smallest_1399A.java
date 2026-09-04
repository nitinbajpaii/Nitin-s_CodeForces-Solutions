package CodeForces;
import java.util.*;

public class Remove_Smallest_1399A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                list.add(arr[i]);
            }
            Collections.sort(list);
            boolean possible = true;
            for(int i=1;i<list.size();i++){
                if(Math.abs(list.get(i)-list.get(i-1))>1){
                    possible = false;
                    break;
                }
            }
            if(possible){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
