class Solution {
    public boolean isPalindrome(int x) {
        
        if(x>=0){
        int sum=0,n=x;
           while(x!=0){
               int a = x%10;
               sum=sum*10+a;
               x /= 10;
           }
         if(sum==n)
             return true;
         else
             return false;
        }
        else{
            return false;
        }
    }
}