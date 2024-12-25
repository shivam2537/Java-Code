//import java.lang.Math;

import java.util.Scanner;

public class dectobin {

    public static void dectobin (int n) {
      int pow = 0 ;
      int binnum = 0 ;
      while (n>0){
        int rem = n%2;
         binnum = binnum + (rem * (int)Math.pow(10, pow));
         pow ++ ;
         n = n/2 ;
      }
      System.out.println("binary value is " + binnum);
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int num ;
        System.out.println("enter the decimal num :");
         num = sc.nextInt();
         dectobin(num);
    }

}
