public class Spiral {
    public static void spiralMatrix(int matrix [][]){
        int startRow=0;
        int endRow=matrix.length-1;
        int startCol=0;
        int endCol=matrix[0].length-1;

        while(startRow<=endRow && startCol<=endCol){
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix [startRow][j]+" ");
            }

            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
                
            }
            for(int j=endCol-1;j>=startCol;j--){
                System.out.print(matrix[endRow][j]+" ");
            }
            for(int i=endRow-1;i>=startRow+1;i--){
                System.out.print(matrix[i][startCol]+" ");
                
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
       
    }
    public static void main(String args[]){
        int matrix[][]=  {{1,3,5,7},
                         {3,7,9,5},
                         {4,7,1,9},
                         {6,8,2,9}};
                         spiralMatrix(matrix);
    }
    
}
