package nagaita.tdd.wycash;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class MeneyTest {

	@Test
	public void multiplication() throws Exception {
		// ## Arrange ##
		Money five = Money.dollar(5);

		// ## Act ##

		// ## Assert ##
		assertEquals(five.times(2), Money.dollar(10));
		assertEquals(five.times(3), Money.dollar(15));
	}

	@Test
	public void equality() throws Exception {
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		assertFalse(Money.dollar(5).equals(Money.franc(5)));
	}

	@Test
	public void currency() throws Exception {
		assertThat("USD", is(Money.dollar(0).currency()));
		assertThat("CHF", is(Money.franc(0).currency()));
	}

}