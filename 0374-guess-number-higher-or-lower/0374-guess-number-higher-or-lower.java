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
        
        int min = 1;
        int max = n;
        
        while (min <= max) {
            int middle = min + (max - min) / 2;
            int guess = guess(middle);
            
            if(guess == 0) return middle;
            else if(guess == -1) max = middle - 1;
            else if(guess == 1) min = middle + 1;
        }
        
        return -1;
    }
}