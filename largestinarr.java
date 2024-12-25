public class largestinarr {
    public static int  largestinarr (int arr[] ) {
        int largest = Integer.MIN_VALUE ;
      for(int i = 0 ; i<arr.length ; i++){
        if (arr[i] > largest) {
           largest= arr[i] ;
        }
      }
      return largest; 

    }
    public static void main(String[] args) {
        int arr [] = {4,6,9,7,8,2} ;
       int largest = largestinarr(arr);
        System.out.println("largest num in arr is : " + largest);
        
    }
    

}