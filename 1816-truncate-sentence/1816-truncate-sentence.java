class Solution {
    public String truncateSentence(String s, int k) {
        
         int count=0;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i)==' ')
            {
                count++;
            }
            if(count==k)
            {
                break;
            }
                else {
                builder.append(s.charAt(i));
            }

        }
       return builder.toString();        
    }
}