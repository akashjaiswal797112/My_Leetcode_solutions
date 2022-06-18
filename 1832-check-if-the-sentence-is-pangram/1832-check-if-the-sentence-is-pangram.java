class Solution {
    public boolean checkIfPangram(String sentence) {
        
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        

       char[] alphaArray=alphabet.toCharArray();
        char[] sentArray=sentence.toCharArray();

            int count=0;
        for (int i = 0; i < alphaArray.length; i++) {

            for (int j = 0; j < sentArray.length; j++) {

                if (sentArray[j]==alphaArray[i]) {
                    count++;
                    break;

                }
                
            }
        }
       
        if(count==26)
        {
            return true;
        }
        else
        {
            return false;
        }

         
    }
}