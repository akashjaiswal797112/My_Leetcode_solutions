/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */


public class Solution extends GuessGame {
    public int guessNumber(int n) {
        
       int start=0;
        
       
        while(start <= n)
        {
             int pick = start+ (n-start)/2;
        
            if(guess(pick)==0)
            {
                return pick;
            }
            
            if(guess(pick)==-1){
                n=pick-1;
            }
            else
            {
                start=pick+1;
            }
            
        }
        return -1;
        
        
    }
}