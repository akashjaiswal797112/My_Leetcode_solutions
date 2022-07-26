class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
 
//         StringBuilder builder1 = new StringBuilder();
//         StringBuilder builder2 = new StringBuilder();


//         for (int i = 0; i < word1.length; i++) {
//             builder1.append(word1[i]);
//         }
//         for (int i = 0; i < word2.length; i++) {
//             builder2.append(word2[i]);
//         }
      
//       	return builder1.equals(builder2);    
        
        
        String s1="";
        String s2="";
        for(int i=0;i<word1.length;i++)
            s1+=word1[i];
        for(int j=0;j<word2.length;j++)
            s2+=word2[j];
       return s1.equals(s2);
    }
}