class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
       //  int arr[] = {-1,-1,0,1,1,2,3,5,4,3,2,2,1,1,0};
        int ans = findingPeak(arr);
        return ans;
        
    }
   
    //Akash's solution working fine
    private static int findingPeak(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1])
            {
                return mid;
            }
            else if(arr[mid] < arr[mid+1])
            {
                start = mid;
            }
            else
            {
                end = mid;
            }
        }
        return -1;
    }
   
}