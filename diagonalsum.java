public class diagonal {



    public static int diagonalSumBasic(int matrix[][]){  //result is in O(n²)
        int sum = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){  //matrix[0] means col
                if ( i == j){
                    sum += matrix[i][j];
                }
                else if ( i + j == matrix.length-1){  //n-1/matrix.length-1
                    sum+= matrix[i][j];
                }
            }
        }
        return sum;
    }

    public static int diagonalSum(int matrix[][]) {  //in O(n)
        int sum = 0;
        for (int i = 0; i < matrix.length; i++ ){
            //Primary diagonal
            sum+= matrix[i][i];
            //Secondary diagonal
            // i + j= n-1 / j = n-1-i
            if (i != matrix.length-i-1){
                sum+= matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }

    public static void main(String ags[]){
        int matrix[][] = {{1, 2, 3, 4},
                         {5, 6, 7, 8},
                         {9, 10, 11, 12},
                         {13, 14, 15, 16}};

        System.out.println(diagonalSumBasic(matrix));
        System.out.println(diagonalSum(matrix));

    }
}
