public class timesnuminarr {
    public static void   timesnuminarr (int matrix[][] ,int key){
        int count = 0 ;
        for(int i = 0 ; i<matrix.length; i++){
            for(int j =0 ; j<matrix[0].length ; j++){
                if (matrix[i][j]==key) {
                    count ++ ;
                }
            }
        }
        System.out.println("no of times key occur : " + count);
            }
           
        
     

    
    public static void main(String[] args) {
        int matrix[][] = {{4,7,8},
                          {8,8,7},
                         } ;
        timesnuminarr(matrix,8 );
    }
    
}
