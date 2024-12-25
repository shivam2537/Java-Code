public class pattern {
    public static  void hollow_rectangle (int totrow , int totcol) {
    for(int i = 1 ; i<=totrow ; i++){
        for(int j = 1 ; j <=totcol ; j++){
       if (i == 1 || i==totrow || j==1 || j==totcol) {
        
        System.out.print("*");
       }else {
        System.out.print(" ");
       }
        }
        System.out.println();
    }
    }  
    //********************************************************************************************************************************/

    public static void inverted_half_pyramid (int n){
        for(int i = 1 ; i<=n ; i++){
            for (int j = 1 ; j<=(n-i) ; j++){
                System.out.print(" ");
            }
            for (int j =1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    //*********************************************************************************************************************************//

    public static void inverted_half_num_pyramid(int n) {
        for(int i = 1 ; i<=n ; i++){
            for(int j = 1 ; j<=(n-i+1) ; j++){
            System.out.print(" " + j);
            }
            System.out.println();
        }
        
    }
    //********************************************************************************************************************************//
    
    public static void floyds_triangle(int n) {
        int count = 1 ;
        for(int i=1 ; i<=n; i++){
            for (int j = 1 ; j<=i ; j++){
                System.out.print(" " + count);
                count++;
                 }
        System.out.println();

        }
        }
    //********************************************************************************************************************************//
     
    public static void zero_one_triangles (int n) {
        for(int i = 1 ; i<=n ; i++){
            for (int j=1 ; j<=i ; j++){
                if ((i+j) % 2==0) {
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        
    }
    //********************************************************************************************************************************//

    public static void butterfly (int n) {
        for(int i = 1 ; i<=n ; i++){
            for (int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            for (int j =1 ; j <= (n-i)*2 ; j++){
                System.out.print(" ");
            }
            for (int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();

            }
        for(int i = n ; i>=1 ; i--){
            for (int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            for (int j =1 ; j <= (n-i)*2 ; j++){
                System.out.print(" ");
            }
            for (int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
         }
        }
    //********************************************************************************************************************************//

    public static void solid_rhombus(int n) {
        for(int i = 1 ; i<=n ; i++){
            for (int j = 1 ; j<=(n-i) ; j++){
                System.out.print(" ");
            }
            for (int j = 1 ; j<=n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

       // hollow_rectangle(6, 8);
       // inverted_half_pyramid(4);
       // inverted_half_num_pyramid(5);
       // floyds_triangle(5);
       // zero_one_triangles(5);
      //  butterfly(8);
      solid_rhombus(5);
    }
    
}
