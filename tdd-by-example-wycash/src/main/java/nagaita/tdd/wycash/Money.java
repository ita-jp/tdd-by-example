package nagaita.tdd.wycash;

public abstract class Money {

	protected int amount;
	protected String currency;

	public static Money dollar(int amount) {
		return new Dollar(amount, "USD");
	}

	public static Money franc(int amount) {
		return new Franc(amount, "CHF");
	}

	public Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	abstract Money times(int multiplier);

	public String currency() {
		return currency;
	}

	@Override
	public boolean equals(Object other) {
		Money otherMoney = (Money) other;
		return (this.amount == otherMoney.amount) && this.getClass().equals(other.getClass());
	}
}
