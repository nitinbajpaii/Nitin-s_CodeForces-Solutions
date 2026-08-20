package CodeForces;
import java.util.*;

public class Anton_and_Polyhedrons_785A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] shape = {"Tetrahedron","Cube","Octahedron","Dodecahedron","Icosahedron"};
        int[] arr = {4,6,8,12,20};
        int n = sc.nextInt();
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<shape.length;i++){
            map.put(shape[i],arr[i]);
        }
        int total =0;
        for(int i=0;i<n;i++){
            String str = sc.next();
            total += map.get(str);
        }
        System.out.println(total);
    }
}
