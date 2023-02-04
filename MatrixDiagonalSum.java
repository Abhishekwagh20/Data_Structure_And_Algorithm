package Data_Structure_And_Algorithm;
//https://leetcode.com/problems/matrix-diagonal-sum/
public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int len = mat.length;
        for(int i=0;i<len;i++){
            sum += mat[i][i] + mat[i][len-1-i];
        }
        if(len%2==0){
            return sum;
        }
        return sum - mat[len/2][len/2];
    }
}
