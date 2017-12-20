package nagaita.tdd.wycash;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class FrancTest {

	@Test
	public void multiplication() throws Exception {
		// ## Arrange ##
		Money five = Money.franc(5);

		// ## Act ##

		// ## Assert ##
		assertEquals(five.times(2), Money.franc(10));
		assertEquals(five.times(3), Money.franc(15));
	}

	@Test
	public void equality() throws Exception {
		assertTrue(Money.franc(5).equals(Money.franc(5)));
		assertFalse(Money.franc(5).equals(Money.franc(6)));
	}

	@Test
	public void currency() throws Exception {
		assertThat("CHF", is(Money.franc(0).currency()));
	}
}