class Solution {
    public int[] sumZero(int n) {
       
         int sum=0 ,negative = 0;
            int[] res = new int[n];

            if(n==1)
            {
                res[0]=0;
            }
            else
            {
                for (int i = 1; i < n; i++) {
                    sum=i+sum;
                    negative = i*(-1);
                    res[i]=negative;

                }
                res[0]=sum;

            }
        return res;
        
        
    }
}