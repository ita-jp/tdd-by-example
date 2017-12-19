package nagaita.tdd.wycash;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DollarTest {

	@Test
	public void multiplication() throws Exception {
		// ## Arrange ##
		Dollar five = new Dollar(5);

		// ## Act ##

		// ## Assert ##
		assertEquals(five.times(2), new Dollar(10));
		assertEquals(five.times(3), new Dollar(15));
	}

	@Test
	public void equality() throws Exception {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
		assertFalse(new Dollar(5).equals(new Franc(5)));
	}

}