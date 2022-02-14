import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HangmanTest {

    Hangman hangman;

    @BeforeEach
    void setUp() {
        hangman = new Hangman();
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void main() {
    }

    @Test
    void getWord(){
        assertEquals("Dog", Hangman.getWord());
    }

    @Test
    void getInput(){
        //assertEquals("", Hangman.getWord());
    }
    @Test
    void checkLetter(String letter, String word, StringBuilder correct, StringBuilder incorrect) {



    }
}