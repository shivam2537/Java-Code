public class diagonalsum {
    public static int  diagonalsum (int matrix[][]){
        int sum = 0 ;
        for(int i = 0 ; i<matrix.length ; i++){
             sum = sum + matrix[i][i] ;
             if (i != matrix.length-1-i){ 
                sum +=  matrix[i][matrix.length-1-i] ;
             }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}} ;
       int sum = diagonalsum(matrix) ;
       System.out.println("diagonal sum is : "+ sum);
    }
    
}
