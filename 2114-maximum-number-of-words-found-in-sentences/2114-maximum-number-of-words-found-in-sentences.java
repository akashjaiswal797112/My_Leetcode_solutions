class Solution {
    public int mostWordsFound(String[] sentences) {
            
        int maxNum=0,count;
            for (int i = 0; i < sentences.length; i++) {
              
                count=1;
                for (int j = 0; j < sentences[i].length(); j++) {
                    if(sentences[i].charAt(j) == ' '){
                        count++;
                    }
                }
             
                maxNum = Math.max(count,maxNum);
            
            }
           return maxNum; 
        
    }
}