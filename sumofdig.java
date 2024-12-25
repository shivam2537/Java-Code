public class sumofdig {
    public static void sumofdig (int n) {
        int sum = 0 ;
        while (n>0) {
            int lastdig = n%10 ;
            sum = sum + lastdig ;
     n = n/10 ;
        }
     System.out.println("sum of digits are " + sum);
    }

    public static void main(String[] args) {
        sumofdig(123456789);
    }
    
}
