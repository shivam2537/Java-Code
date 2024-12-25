
public class linearsearch {
    public static int  linearsearch(int arr[] , int key) {
        for(int i=0 ; i<arr.length ; i++){
            if (arr[i] == key) {
                return  i ;
            }
            }
           return 0 ;

        }
    
    public static void main(String[] args) {
        int arr [] = {4,6,9,7,8,2} ;
      int index = linearsearch(arr , 1);
        if (index == 0) {
            System.out.println("not found");
        }else {
            System.out.println("key found at index : " + index);
        }
    }
    
}
