import java.util.*;
public class B_to_D33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b= sc.nextInt();
        int t = b;
        int d=0;
        int i=0;
        while (t>0) {
            int r = t%10;
            t = t/10;
            d+=r* (int) Math.pow(2, i++);
        }
        System.out.println("decimal = "+d);
        sc.close();
    }
}
