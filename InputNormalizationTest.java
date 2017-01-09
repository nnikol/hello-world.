package javengers;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * JUnit test for method InputNormalization() of Normalization Class.
 * 
 * @author Nikos
 */
public class InputNormalizationTest {

  @Test
    public final void testInpuNormalization() {

    // case0 lowercase Εnglish
    String actual0 = Normalization.inputNormalization("Hello");
    String expected0 = "hello";
    assertTrue(expected0.equals(actual0));

    // case1 lowercase Greek
    String actual1 = Normalization.inputNormalization("Καλημερα");
    String expected1 = "καλημερα";
    assertTrue(expected1.equals(actual1));

    // case2 remove non alphanumerical characters
    String actual2 = Normalization.inputNormalization("!@#$%^&*()_+{}|.,[Hello]");
    String expected2 = "hello";
    assertTrue(expected2.equals(actual2));

    // case2a remove special characters
    String actual2a = Normalization.inputNormalization("\b\t\nHello\f\r\'\"\\");
    String expected2a = "hello";
    assertTrue(expected2a.equals(actual2a));

    // case3 remove Greek accents (polysyllabic word with two accent marks)
    String actual3 = Normalization.inputNormalization("Αυτοκίνητό");
    String expected3 = "αυτοκινητο";
    assertTrue(expected3.equals(actual3));

    // case3a remove Greek accents (word with 1 accent mark)
    String actual3a = Normalization.inputNormalization("Αυτοκίνητό");
    String expected3a = "αυτοκινητο";
    assertTrue(expected3a.equals(actual3a));

    // case4 input is null
    String actual4 = Normalization.inputNormalization("");
    String expected4 = "";
    assertTrue(expected4.equals(actual4));

    // case5 number input
    String actual5 = Normalization.inputNormalization("2016");
    String expected5 = "2016";
    assertTrue(expected5.equals(actual5));
  }
}
