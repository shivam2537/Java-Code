public class recursionprac {

    public static void  indicesAt (int arr[] , int i , int key){
        if (i == arr.length) {
            return; 
        }
          if (arr[i] == key) {
            System.out.print(i + " ");
            }
            indicesAt(arr, i+1, key);
    }

    public static void numtostr (int num ){
        String str [] = {"zero" , "one" ,"two","three","four","five","six","seven","eight","nine"};
        if (num==0) {
            return ;
        }
        int lastdigit = num%10;
        numtostr(num/10);
        System.out.print(str[lastdigit] + ' ');
    }

    public static int strlength (String str){
        if (str.length()==0) {
            return 0 ;
        }
        return  strlength(str.substring(1) ) + 1;

    }

    public static int countsubstr (String str , int i , int j , int n){

        if (n==1) {
            return 1 ;
        }
        if (n <= 0) {
            return  0 ;
        }
        int res = countsubstr(str, i+1, j, n-1)+
                  countsubstr(str, i, j-1, n-1) -
                countsubstr(str, i+1, j-1, n-2);

                if (str.charAt(i) == str.charAt(j)) {
                    res++ ;
                }
           return res ;
    }
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,2,7,2,2};
        //indicesAt(arr, 0, 2);
        //numtostr(345);
        //String str = "abcdef";
        String str = "aba";
        int n = str.length();
        System.out.print(countsubstr(str, 0, n-1, n));
        
        
    }
    
}
