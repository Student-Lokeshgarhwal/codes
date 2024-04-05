import java.util.*;
public class D_to_B32 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter decimal no.");
        int n =sc.nextInt();
        int t = n;
        String b="";
        //D to B
        while (t>0) {
            int r = t %2;
            b = r + b;
            t=t/2;
        }
        System.out.println(b);
        //D to H
        // char hexa[]={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        // while (t>0) {
        //     int r = t%16;
        //     b=hexa[r]+b;
        //     t=t/16;
        // }
        // System.out.println("hexa= "+b);
        sc.close();
    }
}