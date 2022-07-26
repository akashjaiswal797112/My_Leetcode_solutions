class Solution {
    public boolean isPalindrome(String s) {
        
       
        StringBuilder builder = new StringBuilder();
        String str=s.toLowerCase();
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(  ((ch>='a') && (ch<='z')) || ((ch>='0') && (ch<='9')))
            builder.append(ch);
        }
        String oldString = builder.toString();
        String reverse = String.valueOf(builder.reverse());
        if(oldString.equals(reverse))
            return true;
        else
            return false;
    }
}