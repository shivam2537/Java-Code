import java.util.*;
public class bintodec {
    
public static  void bintodec (int n) {
    int decnum = 0 ;
    int pow = 0 ;
    while (n>0){
        int lastdig = n % 10 ;
        decnum = decnum + (lastdig * (int) Math.pow(2, pow));
        pow++;
        n = n/10 ;
    }
    System.out.println("decimal value is " + decnum);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;
        System.out.println("enter the binary num :");
         num = sc.nextInt();
         bintodec(num);
    }
}
