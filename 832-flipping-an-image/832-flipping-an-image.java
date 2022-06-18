class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
     
        
      int[][] arr=new int[image.length][image.length];

        for (int i = 0; i < image.length; i++) {
            int k= image.length-1;
            for (int j = 0; j < image.length; j++,k--) {

                if(image[i][k]==1)
                {

                    arr[i][j]=0;
                }
                else
                {
                    arr[i][j]=1;
                }

            }
        }

       

       return arr;
        
    }
}