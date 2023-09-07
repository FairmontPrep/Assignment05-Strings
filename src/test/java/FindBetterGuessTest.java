import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class FindBetterGuessTest {
    
    @DisplayName("FindBetterGuessTest 1")
    @Test
    void findBetterGuess_Test01 (){
        String word = "concatenation";
        String first = "con";
        String second = "at";
        WordMatch g = new WordMatch(word);
        String actual = g.findBetterGuess(first, second);
        String expected = "con";
        assertEquals(expected, actual);
    }
    
    @DisplayName("FindBetterGuessTest 2")
    @Test
    void findBetterGuess_Test02 (){
        String word = "concatenation";
        String first = "cat";
        String second = "con";
        WordMatch g = new WordMatch(word);
        String actual = g.findBetterGuess(first, second);
        String expected = "con";
        assertEquals(expected, actual);
    }
    
    @DisplayName("FindBetterGuessTest 3")
    @Test
    void findBetterGuess_Test03 (){
        String word = "walkietalkie";
        String first = "alk";
        String second = "kie";
        WordMatch g = new WordMatch(word);
        String actual = g.findBetterGuess(first, second);
        String expected = "kie";
        assertEquals(expected, actual);
    }
    
    @DisplayName("FindBetterGuessTest 4")
    @Test
    void findBetterGuess_Test04 (){
        String word = "whatalottapizza";
        String first = "a";
        String second = "t";
        WordMatch g = new WordMatch(word);
        String actual = g.findBetterGuess(first, second);
        String expected = "a";
        assertEquals(expected, actual);
    }
    
    @DisplayName("FindBetterGuessTest 5")
    @Test
    void findBetterGuess_Test05 (){
        String word = "mississippi";
        String first = "pp";
        String second = "i";
        WordMatch g = new WordMatch(word);
        String actual = g.findBetterGuess(first, second);
        String expected = "pp";
        assertEquals(expected, actual);
    }
    
    @DisplayName("FindBetterGuessTest 6")
    @Test
    void findBetterGuess_Test06 (){
        String word = "dracula";
        String first = "drac";
        String second = "ula";
        WordMatch g = new WordMatch(word);
        String actual = g.findBetterGuess(first, second);
        String expected = "drac";
        assertEquals(expected, actual);
    }
    
    @DisplayName("FindBetterGuessTest 7")
    @Test
    void findBetterGuess_Test07 (){
        String word = "banana";
        String first = "apple";
        String second = "pear";
        WordMatch g = new WordMatch(word);
        String actual = g.findBetterGuess(first, second);
        String expected = "pear";
        assertEquals(expected, actual);
    }
    
    @DisplayName("FindBetterGuessTest 8")
    @Test
    void findBetterGuess_Test08 (){
        String word = "fuzzywuzzy";
        String first = "uzzy";
        String second = "fuzz";
        WordMatch g = new WordMatch(word);
        String actual = g.findBetterGuess(first, second);
        String expected = "uzzy";
        assertEquals(expected, actual);
    }
    
    @DisplayName("FindBetterGuessTest 9")
    @Test
    void findBetterGuess_Test09 (){
        String word = "aabbababaabaa";
        String first = "a";
        String second = "ba";
        WordMatch g = new WordMatch(word);
        String actual = g.findBetterGuess(first, second);
        String expected = "ba";
        assertEquals(expected, actual);
    }
    
    @DisplayName("FindBetterGuessTest 10")
    @Test
    void findBetterGuess_Test10 (){
        String word = "lasttest";
        String first = "t";
        String second = "st";
        WordMatch g = new WordMatch(word);
        String actual = g.findBetterGuess(first, second);
        String expected = "st";
        assertEquals(expected, actual);
    }
}
