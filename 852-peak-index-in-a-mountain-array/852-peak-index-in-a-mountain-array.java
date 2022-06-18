class Solution {
    public int peakIndexInMountainArray(int[] arr) {
          int large=arr[0],check=0;
        
        for(int i=1;i<arr.length;i++){
            if(arr[i] > large){
                large=arr[i];
                check=i;
            }
        }
        return check;
        
    }
}