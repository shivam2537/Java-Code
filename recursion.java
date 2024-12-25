public class recursion {

    public static void numindecorder (int n){
       if (n==1) {
       System.out.print(n);
       return ;
       }
        System.out.print(n + " ");
        numindecorder(n-1);
    }

    public static void  numinincorder (int n){
      if (n==1) {
            System.out.print(n + " ");
            return;
        }
        numinincorder(n-1);
        System.out.print(n + " ");
    }


    public static int factorial (int n){
        if (n==0) {
            return  1 ;
        }
        int fact = n * factorial(n-1);
          return fact ;
    }


    public static int sumofnnaturalnum (int n){
        if (n==1) {
            return 1 ;
        }
      int sum =  n + sumofnnaturalnum(n-1);
        return sum ;
    }


    public static int fabonacci (int n){
        if (n==1 || n==0) {
            return n ;
        }
        int fabnum = fabonacci(n-1) + fabonacci(n-2) ;
        return fabnum ;
      }

    public static boolean  sortarr (int arr[] , int n  ){
    
            if (n == arr.length-1) {
                return  true ;
            }
            if (arr[n]>arr[n+1]) {
                return  false ;
            }
            return  sortarr(arr , n +1 );

    }

    public static int firstocc (int arr[] , int n , int key ){
        if (arr[n] == key) {
            return  n ;
        }
        return firstocc(arr, n+1 , key);
    }
     

    public static int lastocc (int arr[] , int n , int key ){
        if (n == arr.length) {
            return -1 ;
        }
        
       int isfound = firstocc(arr, n+1 , key);
       if (isfound==-1 && arr[n]==key) {
        return  n ;
       }
         
       return  isfound ;
       
    }
     

    
    public static void main(String[] args) {
       // numindecorder(5);
       //numinincorder(5);
       //System.out.println(factorial(5));
       //System.out.println(sumofnnaturalnum(5));
       //System.out.println(fabonacci(6));
       int arr[] = {1,5,3,4,3};
       //System.out.println(sortarr(arr, 0));
        System.out.println(firstocc(arr, 0, 4));
    }
    
}
