package knu.fit.ist.ta;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TaApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void test1() {

        assertEquals(0.02f, 0.025f, 0.01f);
    }

    @Test
    void Laba2Test() {
        knu.fit.ist.ta.lab2.Calculate calculator = new knu.fit.ist.ta.lab2.Calculate();

        assertTrue(Float.MAX_VALUE != calculator.lab2equation(2));
        assertEquals(-0.071, calculator.lab2equation(0.5));
        assertEquals(0.179, calculator.lab2equation(2));
    }

    @Test
    void Laba3Test() {
        double max;
        double min;
        knu.fit.ist.ta.lab3.Lab3Arr arr = new knu.fit.ist.ta.lab3.Lab3Arr();
        arr.ShowArray();
        max = arr.GetMax();
        min = arr.GetMin();

        assertTrue(max > 0);
        assertTrue(min >= 0);
        assertFalse(min < 0);
        assertFalse(max < 0);
        assertTrue(max > min);
    }

    @Test
    void Laba4Test() {
        int NumberWords;
        int NumberUniqueWords;
        int WordsWithoutZ;
        int WordsWithTwoLetter;

        knu.fit.ist.ta.lab4.Lab4Text text = new knu.fit.ist.ta.lab4.Lab4Text();

        text.WorkWithText();
        NumberWords = text.GetWords();
        NumberUniqueWords = text.GetUniqueWords();
        WordsWithoutZ = text.WordsWithoutZ('z');
        WordsWithTwoLetter = text.WordsWithTwoLetters();

        assertTrue(NumberWords > 0);
        assertTrue(NumberUniqueWords > 0);
        assertFalse(WordsWithoutZ < 452);
        assertFalse(WordsWithTwoLetter < 86);

        knu.fit.ist.ta.lab4.Lab4Text text2 = new knu.fit.ist.ta.lab4.Lab4Text("");

        assertFalse(text2.GetWords() > 0);
        assertFalse(text2.GetUniqueWords() > 0);
        assertFalse(text2.WordsWithoutZ('z') > 0);
        assertFalse(text2.WordsWithTwoLetters() > 0);

        assertEquals(text2.GetWords(), 0);
        assertEquals(text2.GetUniqueWords(), 0);
        assertEquals(text2.WordsWithoutZ('z'), 0);
        assertEquals(text2.WordsWithTwoLetters(), 0);
    }
}
