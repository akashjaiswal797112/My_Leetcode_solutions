class Solution {
    public boolean halvesAreAlike(String s) {
        
       

        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if(i>=s.length()/2)
            {
                builder2.append(s.charAt(i));
            }
            else
            {
                builder1.append(s.charAt(i));
            }

        }

         int count1 = 0;
         int count2 = 0;



        for (int a = 0; a < builder1.length(); a++) {
            switch (builder1.charAt(a))
            {
                case 'a':
                    count1++;
                    break;

                case 'e':
                    count1++;
                    break;

                case 'i':
                    count1++;
                    break;

                case 'o':
                    count1++;
                    break;

                case 'u':
                    count1++;
                    break;

                case 'A':
                    count1++;
                    break;

                case 'E':
                    count1++;
                    break;

                case 'I':
                    count1++;
                    break;

                case 'O':
                    count1++;
                    break;

                case 'U':
                    count1++;
                    break;
            }
        }

            for (int b = 0; b < builder2.length(); b++) {
                switch(builder2.charAt(b))
                {
                    case 'a' : count2++;
                        break;

                    case 'e' : count2++;
                        break;

                    case 'i' : count2++;
                        break;

                    case 'o' : count2++;
                        break;

                    case 'u' : count2++;
                        break;

                    case 'A' : count2++;
                        break;

                    case 'E' : count2++;
                        break;

                    case 'I' : count2++;
                        break;

                    case 'O' : count2++;
                        break;

                    case 'U' : count2++;
                        break;
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