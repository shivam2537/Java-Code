//import java.lang.Math;

public class checkprime {
    
    
    public static void checkprime (int n) {
    boolean isprime = true ;

     for(int i = 2 ; i<=n-1 ; i++){
            if (n % i == 0){
             isprime = false ;
             break;
            } 
        }
        if (isprime == false){
            System.out.println("not prime");
        }else{
            System.out.println("prime");
        }
    }
    public static void main(String[] args) {
    checkprime(8);
        
    }
}
