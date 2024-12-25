

public class transposeofmatrix {

    public static void printmatrix(int matrix[][]) {
        for(int i = 0 ; i<matrix.length ; i++){
            for(int j = 0 ; j<matrix[0].length ; j++){
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
}
    }
    public static void transposeofmatrix(int matrix[][] ){
        int row = matrix.length ;
        int col = matrix[0].length ;
        int transposematrix[][] = new int [col][row] ;
                for(int i = 0 ; i<matrix.length ; i++){
                    for(int j = 0 ; j<matrix[0].length ; j++){
                    transposematrix[j][i] = matrix[i][j] ;
                    }
                }
                printmatrix(transposematrix);
         }
                   


    
    public static void main(String[] args) {
        int matrix [][] = {{1,2,3},
                           {4,5,6}};
        transposeofmatrix(matrix);
    }
}
