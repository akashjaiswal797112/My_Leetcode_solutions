class Solution {
    public boolean isPalindrome(String s) {
        
       
        StringBuilder builder = new StringBuilder();
        String str=s.toLowerCase();
        for (int i = 0; i < str.length(); i++){
         
            if(  ((str.charAt(i)>='a') && (str.charAt(i)<='z')) || ((str.charAt(i)>='0') && (str.charAt(i)<='9')))
            builder.append(str.charAt(i));
        }
        String oldString = builder.toString();
        String reverse = String.valueOf(builder.reverse());
        if(oldString.equals(reverse))
            return true;
        else
            return false;
    }
}