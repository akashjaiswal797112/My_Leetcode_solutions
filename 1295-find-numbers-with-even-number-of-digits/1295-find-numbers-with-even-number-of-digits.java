class Solution {
    public int findNumbers(int[] nums) {
        
         String str="";
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            str = String.valueOf(nums[i]);
            if (str.length() % 2 == 0)
            {
                count++;
            }
        }
            return count;
        
        
    }
}