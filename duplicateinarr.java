public class duplicateinarr {
    public static boolean  duplicateinarr (int arr[]){
        
      for(int i =0 ; i<arr.length -1 ; i++){
        for (int j = i+1 ; j<arr.length ; j++){
       if (arr[i] == arr[j]) {
        return true;
       }
    }
      }
      return false;
      
       }
    
    public static void main(String[] args) {
        int arr [] = {1,2,3,1} ;
       boolean duplicateinarr = duplicateinarr(arr);
       if (duplicateinarr == true) {
        System.out.println("true");
       }else{
        System.out.println("false");
       }
    }
    
}
