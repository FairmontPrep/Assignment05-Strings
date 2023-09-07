import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CodeWordChecker1Test {
    @DisplayName("CodeWordChecker Test 1")
    @Test
    void codeWordChecker_Test01 (){
        int min = 5;
        int max = 10;
        String symbol = "a";
        CodeWordChecker cw = new CodeWordChecker(min, max, symbol);
        boolean received = cw.isValid("happy");
        assertTrue(!received);
    }

    @DisplayName("CodeWordChecker Test 2")
    @Test
    void codeWordChecker_Test02 (){
        int min = 5;
        int max = 7;
        String symbol = "r";
        CodeWordChecker cw = new CodeWordChecker(min, max, symbol);
        boolean received = cw.isValid("science");
        assertTrue(received);
    }

    @DisplayName("CodeWordChecker Test3")
    @Test
    void codeWordChecker_Test03 (){
        int min = 5;
        int max = 10;
        String symbol = "bun";
        CodeWordChecker cw = new CodeWordChecker(min, max, symbol);
        boolean received = cw.isValid("abundance");
        assertTrue(!received);
    }

    @DisplayName("CodeWordChecker Test 4")
    @Test
    void codeWordChecker_Test04 (){
        int min = 5;
        int max = 10;
        String symbol = "boy";
        CodeWordChecker cw = new CodeWordChecker(min, max, symbol);
        boolean received = cw.isValid("sail");
        assertTrue(!received);
    }

    @DisplayName("CodeWordChecker Test 5")
    @Test
    void codeWordChecker_Test05 (){
        int min = 2;
        int max = 7;
        String symbol = "write";
        CodeWordChecker cw = new CodeWordChecker(min, max, symbol);
        boolean received = cw.isValid("computer");
        assertTrue(!received);
    }

    @DisplayName("CodeWordChecker Test 6")
    @Test
    void codeWordChecker_Test06 (){
        int min = 5;
        int max = 10;
        String symbol = "d";
        CodeWordChecker cw = new CodeWordChecker(min, max, symbol);
        boolean received = cw.isValid("wisconsin");
        assertTrue(received);
    }

    @DisplayName("CodeWordChecker Test 7")
    @Test
    void codeWordChecker_Test07 (){
        int min = 3;
        int max = 5;
        String symbol = "r";
        CodeWordChecker cw = new CodeWordChecker(min, max, symbol);
        boolean received = cw.isValid("cat");
        assertTrue(received);
    }

    @DisplayName("CodeWordChecker Test 8")
    @Test
    void codeWordChecker_Test08 (){
        int min = 5;
        int max = 13;
        String symbol = "nec";
        CodeWordChecker cw = new CodeWordChecker(min, max, symbol);
        boolean received = cw.isValid("connecticut");
        assertTrue(!received);
    }

    @DisplayName("CodeWordChecker Test 9")
    @Test
    void codeWordChecker_Test09 (){
        int min = 6;
        int max = 14;
        String symbol = "harry";
        CodeWordChecker cw = new CodeWordChecker(min, max, symbol);
        boolean received = cw.isValid("potter");
        assertTrue(received);
    }

    @DisplayName("CodeWordChecker Test 10")
    @Test
    void codeWordChecker_Test10 (){
        int min = 5;
        int max = 10;
        String symbol = "add";
        CodeWordChecker cw = new CodeWordChecker(min, max, symbol);
        boolean received = cw.isValid("sadly");
        assertTrue(received);
    }
}
