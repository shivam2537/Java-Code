public class pairsarr {
    public static void pairsarr (int arr[]){
        for (int i =0 ; i< arr.length ; i++){
            int curr = arr [i] ;
            for ( int j = i+1 ; j<arr.length ; j++){
                System.out.println(curr + " " + arr[j]);
            }
        }
        
    }
    public static void main(String[] args) {
        int arr [] = {4,6,9,7,8,2} ;
        pairsarr(arr);
    }
    
}
