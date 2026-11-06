public class Dsum {
    public static int diagonalSum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];
            if(i!=matrix.length-1-i)
                sum+=matrix[i][matrix.length-i-1];
            
        }
        return sum;
    }
    public static void main(String args[]){
        int matrix[][]={{2,6,9,1},
                    {4,8,2,6},
                    {7,5,3,1},
                    {5,0,2,1}};
                    diagonalSum(matrix);
    }
    
}
