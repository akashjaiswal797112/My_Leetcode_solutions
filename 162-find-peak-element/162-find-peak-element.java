class Solution {
    public int findPeakElement(int[] arr) {
         int ans = findingPeak(arr);
        return ans;
    }
    
    //Akash's solution working fine
    private  int findingPeak(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start < end)
        {
            int mid = start + (end-start)/2;
           
         if(arr[mid] < arr[mid+1])
            {
                start = mid+1;
            }
            else
            {
                end = mid;
            }
        }
        return start;
    }
}