package CodeForces;

import java.util.*;

public class Laptops_456A {
    static class Laptop{
        int price;
        int quality;
        Laptop(int price,int quality){
            this.price=price;
            this.quality=quality;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Laptop[] arr = new Laptop[n];
        for(int i=0;i<n;i++){
            arr[i] = new Laptop(sc.nextInt(),sc.nextInt());
        }
        Arrays.sort(arr,(a,b)-> a.price-b.price);
        for(int i=1;i<n;i++){
            if(arr[i].quality<arr[i-1].quality){
                System.out.println("Happy Alex");
                return;
            }
        }
        System.out.println("Poor Alex");

    }
}
