class Solution {
    public int[] twoSum(int[] numbers, int target){
        int start=0;
        int end=numbers.length-1;
        int[] output=new int[2];
        while(start<end){
            int mid = start + (end-start)/2;
            int sum = numbers[start]+numbers[end];
            if(sum == target) {
                output[0]=start+1;
                output[1]=end+1;
                break;
            } 
            else if(sum > target){
                end--;
            }
            else if(sum < target){
                start++;
            }
        }
         return output; 
    }
}