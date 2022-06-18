class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        int goodpairs=0,start,ans=0,len=nums.length;
        for (int i = 0 ; i < len ; i++) {
            int count=1;
            for (int j = i+1; j < len; j++) {

                if(nums[i]!=0)
                {
                    if(nums[i]==nums[j])
                    {
                        nums[j]=0;
                        count++;
                    }
                }
            }
                ans+= count * ( count - 1)/2;
        }
return ans;        
    }
}