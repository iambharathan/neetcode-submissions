class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int col = matrix[0].length;

        int top = 0;
        int bot = rows -1;
        int row =0;
        while(top <= bot){
            row = top + (bot - top) / 2;
            if(target > matrix[row][col-1]){
                top = row + 1;
            } else if(target < matrix[row][0]){
                bot = row - 1;
            } else{
                break;
            }

        }

        if(!(top<=bot)){
            return false;
        }
        int l = 0;
        int r = col - 1;
        while(l<=r){
           int m = l + (r - l)/2;
           if(target > matrix[row][m]){
            l = m+1;
           }
           else if(target < matrix[row][m]){
            r = m-1;
           }
           else{
            return true;
           }

        }

    return false;
    }
}
