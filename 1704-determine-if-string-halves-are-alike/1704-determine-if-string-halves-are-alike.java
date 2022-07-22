class Solution {
    public boolean halvesAreAlike(String s) {

         int count1 = 0;
         int count2 = 0;

        for (int a = 0; a < s.length()/2; a++) {
            switch (s.charAt(a))
            {

                case 'a', 'e', 'i', 'o', 'u':
                case 'A', 'E', 'I', 'O', 'U':
                    count1++;

            }
        }

            for (int b = s.length()/2; b < s.length(); b++) {
                switch(s.charAt(b))
                {
                    case 'a', 'e', 'i', 'o', 'u':
                    case 'A', 'E', 'I', 'O', 'U':
                        count2++;
                }
               }
          
        

      
        if(count1==count2)
            return true;
        else
            return false;
        
        
    }
}