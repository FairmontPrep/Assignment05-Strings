import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CodeWordChecker2Test {
    @DisplayName("CodeWordChecker2 Test 1")
    @Test
    void codeWordChecker2_Test01 (){
        String symbol = "cat";
        CodeWordChecker cw = new CodeWordChecker(symbol);
        boolean received = cw.isValid("doggy");
        assertTrue(!received);
    }

    @DisplayName("CodeWordChecker2 Test 2")
    @Test
    void codeWordChecker2_Test02 (){
        String symbol = "or";
        CodeWordChecker cw = new CodeWordChecker(symbol);
        boolean received = cw.isValid("helloworld");
        assertTrue(!received);
    }

    @DisplayName("CodeWordChecker2 Test 3")
    @Test
    void codeWordChecker2_Test03 (){
        String symbol = "&";
        CodeWordChecker cw = new CodeWordChecker(symbol);
        boolean received = cw.isValid("sailor");
        assertTrue(received);
    }

    @DisplayName("CodeWordChecker2 Test 4")
    @Test
    void codeWordChecker2_Test04 (){
        String symbol = "pass";
        CodeWordChecker cw = new CodeWordChecker(symbol);
        boolean received = cw.isValid("thisshouldfailthetest");
        assertTrue(!received);
    }

    @DisplayName("CodeWordChecker2 Test 5")
    @Test
    void codeWordChecker2_Test05 (){
        String symbol = "pass";
        CodeWordChecker cw = new CodeWordChecker(symbol);
        boolean received = cw.isValid("MyPassword");
        assertTrue(received);
    }

    @DisplayName("CodeWordChecker2 Test 6")
    @Test
    void codeWordChecker2_Test06 (){
        String symbol = "i";
        CodeWordChecker cw = new CodeWordChecker(symbol);
        boolean received = cw.isValid("physics");
        assertTrue(!received);
    }

    @DisplayName("CodeWordChecker2 Test 7")
    @Test
    void codeWordChecker2_Test07 (){
        String symbol = "pie";
        CodeWordChecker cw = new CodeWordChecker(symbol);
        boolean received = cw.isValid("leetcode");
        assertTrue(received);
    }

    @DisplayName("CodeWordChecker2 Test 8")
    @Test
    void codeWordChecker2_Test08 (){
        String symbol = "sad";
        CodeWordChecker cw = new CodeWordChecker(symbol);
        boolean received = cw.isValid("saddle");
        assertTrue(!received);
    }

    @DisplayName("CodeWordChecker2 Test 9")
    @Test
    void codeWordChecker2_Test09 (){
        String symbol = "at";
        CodeWordChecker cw = new CodeWordChecker(symbol);
        boolean received = cw.isValid("caterpillar");
        assertTrue(!received);
    }

    @DisplayName("CodeWordChecker2 Test 10")
    @Test
    void codeWordChecker2_Test10 (){
        String symbol = "code";
        CodeWordChecker cw = new CodeWordChecker(symbol);
        boolean received = cw.isValid("hackerman");
        assertTrue(received);
    }
}
