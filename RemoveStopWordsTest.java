package javengers;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Arrays;

/**
 * JUnit test for method removeStopWords() of StopWordsRemoval Class.
 * Only works with lower case input of alpanumeric strings with no accent marks.
 * For complete stop words list check StopWordsRemoval Class.
 * @author Nikos
 */
public class RemoveStopWordsTest {

	@Test
	public final void testRemoveStopWords() {

		// case0 remove single English stop word "the"
		String[] input0 = { "the", "hello" };
		String[] expected0 = StopWordsRemoval.removeStopWords(input0);
		String[] actual0 = { "hello" };
		assertTrue(Arrays.equals(actual0, expected0));

		// case1 remove single Greek stop word "το"
		String[] input1 = { "το", "μηλο" };
		String[] expected1 = StopWordsRemoval.removeStopWords(input1);
		String[] actual1 = { "μηλο" };
		assertTrue(Arrays.equals(actual1, expected1));

		// case2 remove multiple English stop words "the", "and"
		String[] input2 = { "the", "hello", "and", "hello", "the", "and", "today" };
		String[] expected2 = StopWordsRemoval.removeStopWords(input2);
		String[] actual2 = { "hello", "hello", "today" };
		assertTrue(Arrays.equals(actual2, expected2));

		// case3 remove multiple Greek stop words "ενα", "το"
		String[] input3 = { "το","ενα", "πρασινο", "ενα", "μηλο", "το", "κοκκινο", "μηλο" };
		String[] expected3 = StopWordsRemoval.removeStopWords(input3);
		String[] actual3 = { "πρασινο", "μηλο", "κοκκινο", "μηλο" };
		assertTrue(Arrays.equals(actual3, expected3));
	}
}
