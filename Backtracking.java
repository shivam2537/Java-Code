public class Backtracking {
    public static void findsubstring (String str , int i , String ans){
        if (i == str.length()) {
            if (ans.length()==0) {
                System.out.println("null");
            }else {
                System.out.println(ans);
            }
            return;
        }
        findsubstring(str, i+1, ans+str.charAt(i));
        findsubstring(str, i+1, ans);
       
    }

    public static void findpermutation (String str , String ans){
        // base case 
        if (str.length()==0) {
            System.out.println(ans);
            return;
        }
        //recursion
        for (int i=0 ; i<str.length() ; i++){
            char curr = str.charAt(i);
            String Newstr = str.substring(0 , i) + str.substring(i+1) ;
            findpermutation(Newstr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
       // findsubstring(str, 0, "");
       findpermutation(str, "");
    }
    
}
