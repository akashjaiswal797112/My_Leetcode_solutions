class Solution {
    public boolean halvesAreAlike(String s) {
        
       


         int count1 = 0;
         int count2 = 0;



 for (int a = 0; a < s.length()/2; a++) {

            if(s.charAt(a)=='a' || s.charAt(a)=='e' || s.charAt(a)=='i' || s.charAt(a)=='o' || s.charAt(a)=='u' ||
                    s.charAt(a)=='A' || s.charAt(a)=='E' || s.charAt(a)=='I' || s.charAt(a)=='O' || s.charAt(a)=='U')
            {
                count1++;
            }

        }



            for (int b = s.length()/2; b < s.length(); b++) {
                if(s.charAt(b)=='a' || s.charAt(b)=='e' || s.charAt(b)=='i' || s.charAt(b)=='o' || s.charAt(b)=='u' ||
                        s.charAt(b)=='A' || s.charAt(b)=='E' || s.charAt(b)=='I' || s.charAt(b)=='O' || s.charAt(b)=='U')
                {
                    count2++;
                }
        }       





        if(count1==count2)
        {
            return true;
        }
        else
        {
            return false;
        }
        
        
    }
}