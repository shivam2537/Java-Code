import java.util.*;
public class palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;
        
        int revnum = 0 ;
        System.out.println("enter the num :");
         num = sc.nextInt();
        int palindrome = num ;

     while (num > 0) {
        int lastdig = num%10 ;
         revnum = ( revnum * 10 ) + lastdig  ;
        num = num / 10 ;
     }
        if (palindrome == revnum){
            System.out.println("num is a palindrom");
        }else {
            System.out.println("num is not a palindrom");

        }
    }
    
}
