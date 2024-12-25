import java.util.*;
public class oddevensum {
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   
   int number ;
   int evensum = 0;
   int oddsum = 0;
   int choice ;

   do {
      System.out.println("enter the number");
      number = sc.nextInt();
      if (number%2==0) {
         evensum = number+evensum;
         
      }else{
         oddsum = number + oddsum ;
      }

      System.out.println("press 1 to continue or press 0 to exit :");
      choice = sc.nextInt();
   } while (choice==1);

   System.out.println("sum of even num :" + evensum);
   System.out.println("sum of odd num :" + oddsum);

}
}