

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) { 
        int len= mat.length;
        int[][] rotated=new int[len][len];
        int counting=0;
        //this loop is for rotating the matrix 4 times
        for (int z = 1; z <= 4; z++) {
           // System.out.println("z is starting at:"+z);
            int x=0;
            //this loop is for assigning the  rotated matrix to a new matrix called rotated
            for (int i = 0; i < len; i++, x++) { 
                int y = len-1;                    
                for (int j = 0; j < len; j++, y--){
                    rotated[i][j] = mat[y][x];
                   // System.out.print(rotated[i][j]);
                }
               // System.out.println();
            }
            //updating the given "mat" matrix with the rotated
            for (int i = 0; i < len; i++, x++) {
                int y = 1;
                for (int j = 0; j < len; j++, y--) {
                     mat[i][j]=rotated[i][j];
                }
            }
            int count=0;
            //comparing two matrix
            for (int aa = 0; aa < len; aa++) {
                for (int bb = 0; bb < len; bb++){
                    if(target[aa][bb]==rotated[aa][bb]){
                        count ++;
                    }
                }
            }
            if(count==len*len){
                //System.out.println("matched at rotation : "+z);
                break;
            }
            else{
                counting++;
               // System.out.println("not matched");
            }
        }
        if(counting==4){ //if not matched after 4 rotation then false 
            return false;
        }
        else{
           return true;
        }       
    }
}