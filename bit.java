public class bit {
    public static void oddoreven(int n){
        int bitmax = 1 ;
        if ((n & bitmax) == 0) {
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
    public static int  getibit(int n , int key){
        int bitmax = 1<<key ;
        if ((n & bitmax) == 0) {
            return  0 ;
            }else {
                return  1 ;
            }
}
public static int  setibit(int n , int key){
    int bitmax = 1<<key ;
    return (n | bitmax) ;
}   
public static int  clearibit(int n , int key){
    int bitmax = ~(1<<key) ;
    return (n & bitmax) ;
}    



    public static void main(String[] args) {
      //  oddoreven(5);
      System.out.println(clearibit(4, 2));
    }
    
}


