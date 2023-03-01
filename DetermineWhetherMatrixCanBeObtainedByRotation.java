package Data_Structure_And_Algorithm;
//https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/description/
public class DetermineWhetherMatrixCanBeObtainedByRotation {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i = 0; i < 4; i++){
            if(check(mat, target)){
                return true;
            }
            rotate(mat);
        }
        return false;
    }

    public void rotate(int[][] mat){
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < i ;j++){
                int t = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = t;
            }
        }

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length/2; j++){
                int t = mat[i][j];
                mat[i][j] = mat[i][mat.length-1-j];
                mat[i][mat.length-1-j] = t;
            }
        }
    }

    public boolean check(int[][] mat, int[][] target){
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] != target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
