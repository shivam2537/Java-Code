

import java.util.*;

public class stringprac {
    public static boolean  palindrome(String str){
        int end = str.length();
        for (int i = 0 ; i<str.length() ; i++){
            if (str.charAt(i)==str.charAt(end-1)) {
                return true;
            }
            end-- ;

        }
       return false;
    }
    public static void  vowelocc (String str){
        int count = 0 ;
        for (int i =0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            if (ch=='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u' ) {
               count ++ ;
             }
        }
        System.out.println("no. of times vowel occured is :" + count);
    }
    public static boolean isanagram (String str1 , String str2){
        String str = str1.toLowerCase();
        String strr = str2.toLowerCase();

        if (str.length() == strr.length()) {
            char[] strtoarray = str.toCharArray();
            char[] strrtoarray = strr.toCharArray();

           Arrays.sort(strrtoarray);
           Arrays.sort(strtoarray);

           if (Arrays.equals(strtoarray, strrtoarray)) {
            return true ;
           }
            
        }
        
            return false;
        

    }
    
    public static void main(String[] args) {
        System.out.println(isanagram("raca", "care"));
        //String str = "aaa" ;
       
       // vowelocc(str);
       /*boolean ispalindrome = palindrome(str);
       if (ispalindrome) {
        System.out.println("palindrome");
       }else{
       System.out.println("not palindrome");
    }
}*/
}
}