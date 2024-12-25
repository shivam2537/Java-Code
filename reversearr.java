public class reversearr {

    public static void  reversearr (int arr[]){
        int temp ;
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            temp = arr[end] ;
            arr[end] = arr[start];
            arr[start] = temp ;

            start ++ ;
            end -- ;
            
        }
     
    }

    public static void main(String[] args) {
        int arr [] = {4,6,9,7,8,2} ;
        reversearr(arr);
        for (int i=0 ; i<arr.length ; i++){
            System.out.print( " " + arr[i]);
        }
        System.out.println();
    }
    
}
