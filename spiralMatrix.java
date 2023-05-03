import java.util.Scanner;

public class Spiralmatrix {

    public static void spiralMatrix2DArrays(int spiral[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = spiral.length-1;
        int endCol = spiral[0].length-1;

        while (startRow <= endRow && startCol <= endCol){
            //top
            for (int j = startCol; j <= endCol; j++){
                System.out.print(spiral[startRow][j] + " ");
            }
            //for rightBoundary

            for (int i=startRow+1; i <= endRow; i++){
                System.out.print(spiral[i][endCol]+ " ");
            }

            //Bottom

            for (int j = endCol-1; j >= startCol; j--){
                if (startRow == endRow){
                    break;
                }
                System.out.print(spiral[endRow][j] + " ");
            }

            //for leftBoundary

            for (int i = endRow-1; i >= startRow+1; i--){
                if (startCol == endCol){
                    break;
                }
                System.out.print(spiral[i][startCol] + " ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }

    public static void main(String ags[]){
        int spiral[] [] = {{1, 2, 3, 4},
                           {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};


        spiralMatrix2DArrays(spiral);
    }
}
