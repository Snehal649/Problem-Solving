public class Searchdiagonal {
    public static boolean staircaseSearch(int matrix[][],int key){
             int row=0; col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("Key found at:("+row+" , "+col+")");
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
         }
    }
    public static void main(String args[]){
        int matrix [][]={{1,5,7,3},
    {2,5,9,6},
    {7,9,2,1},
    {4,6,9,7}};
}}

