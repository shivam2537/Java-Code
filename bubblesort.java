public class bubblesort {
    public static void bubblesort (int arr []){
        for ( int i = 1 ; i<arr.length  ; i++){
            for (int j = 0 ; j<arr.length -1 ; j++){
                if (arr[j] > arr[j+1]) {
                    
                int temp = arr[j] ;
                    arr[j] = arr[j+1] ;
                    arr[j+1] = temp ;
                }
            }
        }
    }
    public static void printarr(int arr []){
        for (int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr [] = {4,6,9,7,8,2} ;
        bubblesort(arr);
        printarr(arr);
    }
    
}
