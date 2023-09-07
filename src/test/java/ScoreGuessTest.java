import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ScoreGuessTest {
    @DisplayName("ScoreGuess Test 1")
    @Test
    void scoreGuess_Test01 (){
        String word = "mississippi";
        String guess = "i";
        WordMatch g = new WordMatch(word);
        int score = g.scoreGuess(guess);
        int expected = 4;
        assertEquals(expected, score);
    }

    @DisplayName("ScoreGuess Test 2")
    @Test
    void scoreGuess_Test02 (){
        String word = "mississippi";
        String guess = "iss";
        WordMatch g = new WordMatch(word);
        int score = g.scoreGuess(guess);
        int expected = 18;
        assertEquals(expected, score);
    }

    @DisplayName("ScoreGuess Test 3")
    @Test
    void scoreGuess_Test03 (){
        String word = "banana";
        String guess = "an";
        WordMatch g = new WordMatch(word);
        int score = g.scoreGuess(guess);
        int expected = 8;
        assertEquals(expected, score);
    }

    @DisplayName("ScoreGuess Test 4")
    @Test
    void scoreGuess_Test04 (){
        String word = "neat-meat-eater";
        String guess = "eat";
        WordMatch g = new WordMatch(word);
        int score = g.scoreGuess(guess);
        int expected = 27;
        assertEquals(expected, score);
    }

    @DisplayName("ScoreGuess Test 5")
    @Test
    void scoreGuess_Test05 (){
        String word = "banana";
        String guess = "anana";
        WordMatch g = new WordMatch(word);
        int score = g.scoreGuess(guess);
        int expected = 25;
        assertEquals(expected, score);
    }

    @DisplayName("ScoreGuess Test 6")
    @Test
    void scoreGuess_Test06 (){
        String word = "starwars";
        String guess = "starwars";
        WordMatch g = new WordMatch(word);
        int score = g.scoreGuess(guess);
        int expected = 64;
        assertEquals(expected, score);
    }

    @DisplayName("ScoreGuess Test 7")
    @Test
    void scoreGuess_Test07 (){
        String word = "fairmont";
        String guess = "fair";
        WordMatch g = new WordMatch(word);
        int score = g.scoreGuess(guess);
        int expected = 16;
        assertEquals(expected, score);
    }

    @DisplayName("ScoreGuess Test 8")
    @Test
    void scoreGuess_Test08 (){
        String word = "aaaaah";
        String guess = "aa";
        WordMatch g = new WordMatch(word);
        int score = g.scoreGuess(guess);
        int expected = 36;
        assertEquals(expected, score);
    }

    @DisplayName("ScoreGuess Test 9")
    @Test
    void scoreGuess_Test09 (){
        String word = "hippopotamus";
        String guess = "hippopota";
        WordMatch g = new WordMatch(word);
        int score = g.scoreGuess(guess);
        int expected = 81;
        assertEquals(expected, score);
    }

    @DisplayName("ScoreGuess Test 10")
    @Test
    void scoreGuess_Test10(){
        String word = "my";
        String guess = "virginia";
        WordMatch g = new WordMatch(word);
        int score = g.scoreGuess(guess);
        int expected = 0;
        assertEquals(expected, score);
    }
}
