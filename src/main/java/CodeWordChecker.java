/*
 * A CodeWordChecker object can be constructed with three parameters: 
 * two integers and a string. The first two parameters specify the minimum 
 * and maximum code word lengths, respectively, and the third parameter 
 * specifies a string that must not occur in the code word.
 * A CodeWordChecker object can also be constructed with a single parameter 
 * that specifies a string that must not occur in the code word; in this case 
 * the minimum and maximum lengths will default to 6 and 20, respectively.
 */

public class CodeWordChecker {
    private int minLength;
    private int maxLength;
    private String notAllowed;

    /* COMPLETE THIS CONSTRUCTOR
     * The first two parameters specify the minimum and maximum code word 
     * lengths, respectively, and the third parameter specifies a string 
     * that must not occur in the code word.
     * Example:
     * CodeWordChecker cw1 = new CodeWordChecker(5,8,"$");
     * Method call              Return value    Explanation
     * cw1.isValid("happy")     true            Code Word is valid
     * cw1.isValid("happy$")    false           Code Word contains "$"
     * cw1.isValid("Code")      false           Code Word is too short
     * cw1.isValid("happyCode") false           Code Word is too long
     */
    public CodeWordChecker(int minLen, int maxLen, String symbol){
        // Insert code below

    }

    /* COMPLETE THIS CONSTRUCTOR
     * A CodeWordChecker object can also be constructed with a single parameter 
     * that specifies a string that must not occur in the code word; in this case 
     * the minimum and maximum lengths will default to 6 and 20, respectively.
     * Example:
     * CodeWordChecker cw2 = new CodeWordChecker("pass");
     * Method call                          Return value    Explanation
     * cw2.isValid("MyPass")                true            Code Word is valid
     * cw2.isValid("Mypassport")            false           Code Word contains "pass"
     * cw2.isValid("happy")                 false           Code Word is too short
     * cw2.isValid("1,000,000,000,000,000") false           Code Word is too long
     */
    public CodeWordChecker(String symbol){
        // Insert code below

    }

    /* COMPLETE THIS METHOD
     * isValid method is the method to be called and checks if the criteria is met.
     * You will need to check if the string that is passed is greater than or equal 
     * to 'minLength', less than or equal to 'maxLength', and does not contain 
     * 'notAllowed'.
     * HINT: Use 'str.indexOf(notAllowed)' to check if the specified string occurs 
     * in the code word.
     */
    public boolean isValid(String str){
        // Insert code below

        return false;
    }
}