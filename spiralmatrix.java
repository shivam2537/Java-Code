public class spiralmatrix {
    public static void spiralmatrix (int matrix[][]){
        int rowstart = 0 ;
        int colstart = 0 ;
        int rowend = matrix.length-1;
        int colend = matrix[0].length-1 ;

        while (rowstart <= rowend && colstart <=colend) {
            for (int j = colstart ; j<=colend ; j++){
                System.out.print(matrix[rowstart][j] + " ");
            }
            for (int i = rowstart+1 ; i<=rowend ; i++){
                System.out.print(matrix[i][colend] + " ");
            }
            for (int j = colend -1 ; j>=colstart ; j--){
                if (rowstart == rowend) {
                    break;
                }
                System.out.print(matrix[rowend][j] + " ");
            }
            for(int i = rowend-1 ; i>=rowstart+1 ; i--){
                if (colstart == colend) {
                    break;
                }
                System.out.print(matrix[i][colstart] + " ");
            }
            rowstart++;
            colstart++;
            rowend--;
            colend--;
        }
        
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}} ;
        spiralmatrix(matrix);
    }
    
}
