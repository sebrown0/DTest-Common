/**
 * 
 */
package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import utils.text_utils.StringUtils;

/**
 * @author SteveBrown
 * @version 1.0
 * 	Initial
 * @since 1.0
 */
class StringTests {

	@Test
	void testSetFirstCharToLower() {
		String res = StringUtils.firstCharToLower("Char");
		assertEquals("char", res);
	}
	@Test
	void testSetFirstCharToLower_withNoString() {
		String res = StringUtils.firstCharToLower("");
		assertEquals("", res);
	}
	@Test
	void testSetFirstCharToLower_withNullString() {
		String res = StringUtils.firstCharToLower(null);
		assertEquals(null, res);
	}
	
	
	@Test
	void replaceFwdSlashes() {
		assertEquals("one.two", StringUtils.replaceFwdSlashes("one/two", "."));		
	}

	@Test
	void camelCase() {
		assertEquals("oneTwo", StringUtils.asCamelCase("OneTwo"));		
	}
	
	@Test
	void pascalCase() {
		assertEquals("OneTwo", StringUtils.asPascalCase("oneTwo"));		
	}

	@Test
	void removeUnderScores() {
		assertEquals("OneTwo", StringUtils.removeUnderScoresAndAsPascalCase("One_two"));
	}
	
	@Test
	void removeUnderScore_replaceWithSpace() {
		assertEquals("One Two", StringUtils.replaceUnderScoresWithSpaceAndAsPascalCase("One_two"));
	}

	@Test
	void removeSpace_asPascal() {
		assertEquals("OneTwo", StringUtils.removeSpacesAndAsPascalCase("One two"));
	}
	
	@Test
	void removeSpace_insertUnderScore_inLower() {
		assertEquals("one_two", StringUtils.replaceSpacesWithUnderScoreAndInLower("One Two"));
	}

}
