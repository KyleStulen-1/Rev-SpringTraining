package com.rev.w1d2.util;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StringUtilTest {

	@Test
	public void testReverse_NullString() {
		assertThrows(IllegalArgumentException.class, () -> {
			StringUtil.reverse(null);
		}, "Input string cannot be null.");	
	}
	
	@Test 
	public void testReverse_EmptyString() {
		assertEquals("", StringUtil.reverse(""));
	}
	
	@Test
	public void testReverse_OneWord() {
		assertEquals("yppah", StringUtil.reverse("happy"));
	}
	
	@Test 
	public void testReverse_TwoWord() {
		assertEquals("sretaW yppohC", StringUtil.reverse("Choppy Waters"));
	}
	
	@Test 
	public void testPalindrome_NullString() {
		assertThrows(IllegalArgumentException.class, () -> {
			StringUtil.isPalindrome(null);
		}, "Input string cannot be null.");
	}
	
	@Test 
	public void testPalindrom_EmptyString() {
		assertTrue(StringUtil.isPalindrome(""));
	}
	@Test
	public void testPalindrome_NotPalindrome() {
		assertFalse(StringUtil.isPalindrome("Cars drive on the road"));
	}
	@Test
	public void testPalindrome_racecar() {
		assertTrue(StringUtil.isPalindrome("racecar"));
	}
}











