package javengers;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Arrays;

/**
 * JUnit test for method textNormalization() of Normalization Class. 
 * It also indirectly tests method removeStopWords() of StopWordsRemoval Class.
 * 
 * @author Nikos
 */
public class TextNormalizationTest {

	@Test
	public final void testTextNormalization() {

		// case0 English text sample taken from GetText class
		// from
		// https://en.wikipedia.org/wiki/2016_San_Pablito_Market_fireworks_explosion
		String[] expected0 = Normalization.textNormalization("According to the Edomex Secretary of "
				+ " Government  José Manzur Quiroga , at least 32 people died, with at least 59 "
				+ "more injured.Of the dead, 26 died at the site of the explosion and six at the "
				+ "hospital. Of the injured, 46 individuals were hospitalized, five of whom were "
				+ "in critical condition . Six children were among the injured, including a girl "
				+ "with burns to over 90% of her body");
		String[] actual0 = { "according", "edomex", "secretary", "government", "jose", "manzur",
				"quiroga", "least", "32", "people", "died", "with", "least", "59", "more", 
				"injured", "dead", "26", "died", "site","explosion", "six", "hospital", "injured",
				"46", "individuals", "were", "hospitalized", "five", "whom", "were", "critical",
				"condition", "six", "children", "were", "among", "injured", "including", "girl",
				"with", "burns", "90", "body" };
		assertTrue(Arrays.equals(actual0, expected0));

		// case1 Greek text sample taken from GetText class
		// from
		// http://euroleague.sport24.gr/article/4446331/o-olympiakos-exase-thn-eykairia.html
		// used \ to escape special character "
		String[] expected1 = Normalization.textNormalization("Στην φετινή EuroLeague απαγορεύεται "
				+ "να υποτιμήσεις οποιονδήποτε αντίπαλο, αλλά κακά τα ψέμματα, υπάρχουν ματς που "
				+ "είσαι το φαβορί, που υπερτερείς, επειδή διαθέτεις μεγαλύτερη εμπειρία, "
				+ "προσωπικότητες παικτών, χημεία και ομοιογένεια, ισχύ σαν ομάδα, το... βάρος "
				+ "στην φανέλα. Θα λέγαμε και επειδή διαθέσεις βάθος στον πάγκο, αλλά είναι λογικό "
				+ "ο Ολυμπιακός να μην το διαθέτει αυτή την στιγμή, έχοντας νοκ-άουτ ταυτόχρονα το "
				+ "\"βασικό\" του \"4άρι\", τον Γιώργο Πρίντεζη και τον \"δεύτερο\" πλέι-μέικερ "
				+ "του, Ντάνιελ Χάκετ");
		String[] actual1 = { "φετινη", "euroleague", "απαγορευεται", "υποτιμησεις", "οποιονδηποτε",
				"αντιπαλο", "κακα", "ψεμματα", "υπαρχουν", "ματς", "εισαι", "φαβορι", "υπερτερεις",
				"διαθετεις", "μεγαλυτερη", "εμπειρια","προσωπικοτητες", "παικτων", "χημεια",
				"ομοιογενεια", "ισχυ", "ομαδα", "βαρος", "φανελα", "θα", "λεγαμε", "διαθεσεις",
				"βαθος", "παγκο", "ειναι", "λογικο", "ολυμπιακος", "μην", "διαθετει", "στιγμη",
				"εχοντας", "νοκ", "αουτ", "ταυτοχρονα", "βασικο", "4αρι", "γιωργο", "πριντεζη",
				"δευτερο", "πλει", "μεικερ", "ντανιελ", "χακετ" };
		assertTrue(Arrays.equals(actual1, expected1));
	}
}
