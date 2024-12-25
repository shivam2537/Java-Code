public class sumofrow {
    public static void sumofrow (int matrix[][], int key){
        int sum = 0 ;
        for (int j =0 ; j<matrix[0].length; j++){
            sum = sum + matrix[key][j];
        }
        System.out.println("sum of your row is : " + sum);
    }
    public static void main(String[] args) {
        int matrix [][] = {{1,4,9},
                           {11,4,3},
                            {2,2,3}};
        sumofrow(matrix, 0);
    }
    
}
