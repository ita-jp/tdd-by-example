package nagaita.tdd.wycash;

public class Money {

	protected int amount;
	protected String currency;

	public static Money dollar(int amount) {
		return new Money(amount, "USD");
	}

	public static Money franc(int amount) {
		return new Money(amount, "CHF");
	}

	public Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}

	public String currency() {
		return currency;
	}

	@Override
	public boolean equals(Object other) {
		Money otherMoney = (Money) other;
		return (this.amount == otherMoney.amount) && this.currency.equals(otherMoney.currency());
	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}
}
