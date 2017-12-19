package nagaita.tdd.wycash;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FrancTest {

	@Test
	public void multiplication() throws Exception {
		// ## Arrange ##
		Franc five = new Franc(5);

		// ## Act ##

		// ## Assert ##
		assertEquals(five.times(2), new Franc(10));
		assertEquals(five.times(3), new Franc(15));
	}

	@Test
	public void equality() throws Exception {
		assertTrue(new Franc(5).equals(new Franc(5)));
		assertFalse(new Franc(5).equals(new Franc(6)));
	}

}