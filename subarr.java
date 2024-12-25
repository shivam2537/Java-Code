

public class subarr {
    public  static void subarr (int arr[]){
        int sum = 0 ;

        for (int i =0 ;i<arr.length ; i++){
            int start = i ;
            for(int j = i+1 ; j<arr.length ; j++){
              int end = j ;
                sum = 0 ;
                for (int k =start ; k<=end ; k++ ){
                    System.out.print(" " + arr[k]   );
                    sum = sum + arr[k] ;
                
                }
               System.out.println();
                
            }
            System.out.println("sum is : " + sum);

          System.out.println();
            
        }
    }

    public static void kadanes (int arr[]){
        int max_sum = Integer.MIN_VALUE ;
        int curr_sum = 0 ;
        for ( int i =0 ; i<arr.length ; i++){
            curr_sum = curr_sum + arr[i] ;
            if (curr_sum < 0) {
                curr_sum = 0 ;
            }
            max_sum = Math.max(curr_sum, max_sum) ;

        }
        System.out.println("max subarr sum is : " + max_sum);
    }
    public static void main(String[] args) {
        int arr [] = {4,6,9,7,8,2} ;
        subarr(arr);
        kadanes(arr);
    }
    
}
