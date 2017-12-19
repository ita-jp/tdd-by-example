package nagaita.tdd.wycash;

public class Money {

	protected int amount;

	@Override
	public boolean equals(Object other) {
		Money otherMoney = (Money) other;
		return this.amount == otherMoney.amount;
	}
}
