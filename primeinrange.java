public class primeinrange {
    public static boolean checkprime (int n) {
        boolean isprime = true ;
    
         for(int i = 2 ; i<=n-1 ; i++){
                if (n % i == 0){
                 isprime = false ;
                 break;
                } 
             }
             return isprime ;
             
        }
    public static void primeinrange (int n) {
    for (int i =2 ; i<=n ; i++){
        if ( checkprime(i)){
            System.out.println(i + " ");
        }
    }
    }
    public static void main(String[] args) {
        primeinrange(100);
    }
    
}
