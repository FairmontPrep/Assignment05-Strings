public class WordMatch {
    private String secret;

    /* 
     * Construts a WordMatch object with the given secret string of lowercase letters
     */
    public WordMatch(String word){
        secret = word;
    }

    /*  COMPELTE THIS METHOD
     * This method determines the score to be returned, scoreGuess finds the number 
     * of times that guess occurs as a substring of secret and then multiplies that 
     * number by the square of the length of guess. Occurrences of guess may overlap 
     * with secret.
     * Assume that the length of guess is less than or equal to the length of scret 
     * and that guess is not an empty string.
     * Precondition: 0 < guess.length() <= secret.length()
     * 
     * EXAMPLE:
     * WordMatch game = new WordMatch("mississippi");
     * Value of guess   Num of Occurrences  Score Calculation   Return value
     * "i"                  4               4 * 1 * 1 = 4           4
     * "iss"                2               2 * 3 * 3 = 18          18
     * "issipp"             1               1 * 6 * 6 = 36          36
     * "mississippi"        1               1 * 11 * 11 = 121       121
     */
    public int scoreGuess(String guess){
        // Insert code below
        
        return 0;
    }

    /*  COMPLETE THIS METHOD
     * This method returns the better guess of its two String parameters, guess1 and guess2.
     * If the scoreGuess method returns different values for guess1 and guess2, 
     * then the guess with higher score is returned. If the scoreGuess method 
     * returns the same value for guess1 and guess2, then the alphabetically 
     * greater guess is returned.
     * Precondition: guess1 and guess2 contain all lowercase letters.
     * 
     * EXAMPLE:
     * WordMatch game = new WordMatch("concatenation");
     * Method Call                      Return value    Explanation
     * game.scoreGuess("ten");              9           1 * 3 * 3
     * game.scoreGuess("at");               8           2 * 2 * 2
     * game.scoreGuess("con");              9           1 * 3 * 3
     * game.findBetterGuess("con", "at");   "con"       "con" has a greater return value than "at",
     *                                                  therefore "con" is returned.
     * game.findBetterGuess("ten", "con");  "ten"       Scores are the same, the alphabetically greater
     *                                                  guess, "ten" is returned.
     */
    public String findBetterGuess(String guess1, String guess2){
        // Insert code below

        return "";
    }
}
