package nagaita.tdd.wycash;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class DollarTest {

	@Test
	public void multiplication() throws Exception {
		// ## Arrange ##
		Dollar five = new Dollar(5);

		// ## Act ##
		Dollar product = five.times(2);

		// ## Assert ##
		assertThat(five.amount, is(5));
		assertThat(product.amount, is(10));
	}

}