package CodeForces;
import java.util.*;

public class Team_Olympiad_490A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                arr1.add(i+1);
            }
            else if(arr[i]==2){
                arr2.add(i+1);
            }
            else{
                arr3.add(i+1);
            }
        }
        int teams = Math.min(arr1.size(),Math.min(arr2.size(),arr3.size()));
        System.out.println(teams);
        for(int i=0;i<teams;i++){
            System.out.println(arr1.get(i)+" "+arr2.get(i)+" "+ arr3.get(i));
        }
    }
}
