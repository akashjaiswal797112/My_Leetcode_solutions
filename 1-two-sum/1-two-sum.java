class Solution {
    public int[] twoSum(int[] nums, int target) {
        
         int len= nums.length;
         int[] extra=new int[2];

        for (int i = 0; i < len-1; i++){
            for (int j = i+1; j < len; j++){
                if(nums[i]+nums[j]==target){
                   extra[0]=i;
                    extra[1]=j;
                    break;
                }
            }
        }
        return extra;
    }
}