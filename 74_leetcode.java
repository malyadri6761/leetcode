class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        for(i=0;i<matrix.length-1;i++){
            if(target==matrix[i][matrix[0].length-1])
                return true;
            else if(!(target>matrix[i][matrix[0].length-1]))
                break;
        }
        for(int j=0;j<matrix[i].length;j++)
            if(target==matrix[i][j])
                return true;
        return false;
    }
}
