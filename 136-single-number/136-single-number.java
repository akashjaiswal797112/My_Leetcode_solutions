class Solution {
    public int singleNumber(int[] nums) {
          int a=0;
        for (int i = 0; i < nums.length; i++){
            int count=0;
            for (int j = 0; j < nums.length; j++){
                if(i!=j){
                    if(nums[i]==nums[j]){
                        count=1;
                    }
                }
            }
            if(count!=1){
                a=nums[i];   
            }
        }
      return a;
    }
}