class Solution {
    public boolean halvesAreAlike(String s) {
        
       


         int count1 = 0;
         int count2 = 0;



        for (int a = 0; a < s.length()/2; a++) {
            switch (s.charAt(a))
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



            for (int b = s.length()/2; b < s.length(); b++) {
                switch(s.charAt(b))
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