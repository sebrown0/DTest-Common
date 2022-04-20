package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import utils.text_utils.StringUtil;

class StringUtilsTests {

	@Test
	void testSetFirstCharToLower() {
		String res = StringUtil.firstCharToLower("Char");
		assertEquals("char", res);
	}
	@Test
	void testSetFirstCharToLower_withNoString() {
		String res = StringUtil.firstCharToLower("");
		assertEquals("", res);
	}
	@Test
	void testSetFirstCharToLower_withNullString() {
		String res = StringUtil.firstCharToLower(null);
		assertEquals(null, res);
	}
	
}
