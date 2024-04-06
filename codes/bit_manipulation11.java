import java.util.*;

public class bit_manipulation11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("get bit");
        System.out.println("enter no. :");
        int n = sc.nextInt();  
        System.out.println("enter position :");
        int pos = sc.nextInt();
        int bitmask = 1<<pos;
       if ((bitmask & n) == 0){
           System.out.println("bit was zero");
       }else{
            System.out.println("bit was one");
       }
       System.out.println("set bit");
       System.out.println("enter no. :");
        int n2 = sc.nextInt();
        System.out.println("enter position :");
        int pos2 = sc.nextInt();
        int bitmask2 = 1<<pos2;
        int newnumber2 = bitmask2 | n2;
        System.out.println(newnumber2);
        System.out.println("clear bit");
       System.out.println("enter no. :");
        int n3 = sc.nextInt();
        System.out.println("enter position :");
        int pos3 = sc.nextInt();
        int bitmask3 = 1<<pos3;
        int notbitmask = ~(bitmask3);
        int newNumber2= notbitmask & n3;
        System.out.println((newNumber2));
        System.out.println("update bit");
        System.out.println("enter no. :");
        int n4 = sc.nextInt();
        System.out.println("enter position :");
        int pos4 = sc.nextInt();
        System.out.println("enter op.(1 for set and 0 for clear :)");
        int operation = sc.nextInt();
        int bitmask4 = 1<<pos4;
        if(operation ==1){
            int newnumber3 = bitmask4 | n4;
            System.out.println(newnumber3);
        }else{
            int notbitmask2 = ~(bitmask4);
            int newNumber3 = notbitmask2 & n;
            System.out.println(newNumber3);
        }
        sc.close();
    }
}