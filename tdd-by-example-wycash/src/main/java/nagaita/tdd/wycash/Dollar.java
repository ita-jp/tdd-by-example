package nagaita.tdd.wycash;

public class Dollar {

	private int amount;

	public Dollar(int amount) {
		this.amount = amount;
	}

	public Dollar times(int multiplier) {
		return new Dollar(amount * multiplier);
	}

	@Override
	public boolean equals(Object other) {
		Dollar otherDollar = (Dollar) other;
		return this.amount == otherDollar.amount;
	}
}
