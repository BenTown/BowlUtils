package test.verify;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import verify.IDCardUitls;

public class IDCardTest {
	
	@Test
	public void test() {
		assertEquals(IDCardUitls.IDCardValidate("43100219730424385x"), "");
	}

}
