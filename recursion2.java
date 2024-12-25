public class recursion2 {

    public static int tillingproblem(int n){
        //base case
        if (n==0 || n==1) {
            return 1 ;
        }
        // vertical choice
        int fnm1 = tillingproblem(n-1);

        // horizontal choice
        int fnm2 = tillingproblem(n-2);

        int totways = fnm1 + fnm2 ;
        return totways ;
    }
    public static void removeduplicatestr (String str , int idx , StringBuilder newstr , boolean map[]){
        if (idx == str.length()) {
            System.out.println(newstr);
            return;
        }

        char currchar = str.charAt(idx);
        if (map[currchar - 'a'] == true) {
            removeduplicatestr(str, idx+1, newstr, map);
        }else {
            map[currchar-'a'] = true ;
            removeduplicatestr(str, idx+1, newstr.append(currchar), map);
        }
    }
    public static int friendspairing(int n){
        if (n==1 || n==2) {
            return  n ;
        }
        // single
        int fnm1 = friendspairing(n-1);
        // pair
        int fnm2 = friendspairing(n-2);
        int pairways = (n-1) * fnm2 ;

        //tot ways
        int tolways = fnm1 + pairways ;
        return  tolways ;
    }

    public static void printbinstrings (int n , int lastplace , String str){
        // base case 
        if (n==0) {
            System.out.println(str);
            return;
        }
        // kaam
        printbinstrings(n-1, 0, str+"0");
        if (lastplace == 0) {
            printbinstrings(n-1, 1, str+"1");
            
        }
    }
    public static void main(String[] args) {
        //System.out.println(tillingproblem(8));
        //String str = "aaabbbcccdddd";
        //removeduplicatestr(str, 0, new StringBuilder(""), new boolean[26]);
        //System.out.println(friendspairing(8));
        printbinstrings(4, 0, "");
    }
   
}
