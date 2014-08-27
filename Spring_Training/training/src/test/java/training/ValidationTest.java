package training;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidationTest {

	@Test
	public void testAtTheRate(){
		assertEquals("test",1,Validation.hasAdd("abc@gmail.com"));
	}
	@Test
	public void testInvalidUserName(){
		assertEquals("test",1,Validation.hasInvalidUserName("abc@gmail.com"));
	
	}
	@Test
	public void testInvalidLast(){
		assertEquals("test",1,Validation.hasInvalidLast("abc@gmail.com"));
	
	}
	@Test
	public void testAtTheRateNeg(){
		assertEquals("test",0,Validation.hasAdd("abcgmail.com"));
	}
	@Test
	public void testInvalidUserNameNeg(){
		assertEquals("test",0,Validation.hasInvalidUserName("ab/<>c@gmail.com"));
	
	}
	@Test
	public void testInvalidLastNeg(){
		assertEquals("test",0,Validation.hasInvalidLast("abc@gmail.com12"));
	
	}
}
