class Solution {
    public int lengthOfLastWord(String s) {
        
        
        
            int count=0;
            boolean flag = false;
        for (int i = s.length()-1; i >= 0; i--) {
            if((s.charAt(i)==' '))
            {
                if(flag)
                {
                    return count;
                }
            }
            else
            {
                count++;
                flag=true;
            }

        }
        return count;
    }
}