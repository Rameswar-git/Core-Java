package CompleteInterview.vendingmechine;

public enum Coin {
	PENNY(1), NICKEL(5), DIME(10), QUATER(25);

	int denomination;

	Coin(int price) {
		this.denomination = price;
	}

	public int getDenomination() {
		return denomination;
	}

	public void setDenomination(int denomination) {
		this.denomination = denomination;
	}

}
