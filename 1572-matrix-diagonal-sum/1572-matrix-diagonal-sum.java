class Solution {
    public int diagonalSum(int[][] mat) {
        
         int len=mat.length;
                int count=0;
        
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {

                if( (i==j)  || i+j==len-1)  // or use this for secondary 
                                          // diagonal  (i==x) && (j==y)
                {
                    count=count+mat[i][j];
                  
                }

            }

        }

       return count;
        
    }
}