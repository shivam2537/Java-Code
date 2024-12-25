public class binarysearch {

    public static int   binarysearch (int arr[] , int key) {
        int start = 0;
        int end = arr.length - 1 ;
        while (start <= end) {
            int mid = (start + end)/2;
            if (arr[mid] == key) {
                return mid ;
            } 
            if (arr[mid] < key) {
               start = mid + 1 ;
            }else {
                end = mid - 1 ;
            }
        }
        return 0 ;
            }
           
    
    public static void main(String[] args) {
        int arr [] = {4,6,9,7,8,2} ;
        int key = 1 ;
       int mid = binarysearch(arr , key);
        if (mid!=0) {
            System.out.println("key found at : " + mid);
            
        }else {
            System.out.println("key not found");
        }
    }
    
}
