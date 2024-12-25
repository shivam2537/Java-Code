
import java.io.Console;

public class isEven {
    public static boolean  isEven(int n){
        boolean isEven = false ;
        if (n % 2 == 0) {
            isEven = true ;
        }
        return  isEven ;
    }

    public static void main(String[] args) {
        System.out.println(isEven(5));
    }
    
}
