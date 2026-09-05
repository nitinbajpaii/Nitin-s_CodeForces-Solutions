package CodeForces;

import java.util.*;

public class Registration_system_4C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String,Integer> map = new HashMap<>();
        while(n-->0){
            String str = sc.next();
            if(!map.containsKey(str)){
                System.out.println("OK");
                map.put(str,1);
            }
            else{
                int count = map.get(str);
                System.out.println(str+count);
                map.put(str,count+1);
            }

        }
    }
}
