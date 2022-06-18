class Solution {
    
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        
        if(target > nums[len-1])
            return len;
        else{
            for (int i = 0; i < len; i++) {
                if(target<=nums[i])
                    return i;
            }
        }
        return -1;
    }
    
}