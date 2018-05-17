package CompleteInterview.vendingmechine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VendingMechineUtill {

	public static Item getitem(long currentbalance, long paidamount, CompleteInterview.vendingmechine.Item currentitem)
			throws Exception {
		if (haschange(currentitem.getPrice() - paidamount, currentitem)) {
			VendingMechineimpl vm = new VendingMechineimpl();
			vm.getItems().deductitem(currentitem);
			return currentitem;
		}

		throw new Exception(" Change not valible ");
	}

	public static boolean haschange(long ch, Item currentitem) {
		List<Coin> lst = getchange(ch);
		return !lst.isEmpty();
	}

	public static List<Coin> getchange(long ch) {
		VendingMechineimpl vm = new VendingMechineimpl();
		Inventory<Coin> coins = vm.getCoins();

		List<Coin> cns = new ArrayList<>();

		while (ch > 0) {
			if (ch >= Coin.QUATER.getDenomination() && vm.getCoins().hasitem(Coin.QUATER)) {
				ch = ch - Coin.QUATER.getDenomination();
				cns.add(Coin.QUATER);
			}
			if (ch >= Coin.DIME.getDenomination() && vm.getCoins().hasitem(Coin.DIME)) {
				ch = ch - Coin.QUATER.getDenomination();
				cns.add(Coin.DIME);
			}
			if (ch >= Coin.NICKEL.getDenomination() && vm.getCoins().hasitem(Coin.NICKEL)) {
				ch = ch - Coin.NICKEL.getDenomination();
				cns.add(Coin.NICKEL);
			}
			if (ch >= Coin.PENNY.getDenomination() && vm.getCoins().hasitem(Coin.PENNY)) {
				ch = ch - Coin.PENNY.getDenomination();
			}

		}

		return cns;
	}

	public static List<Coin> getbalanceamount(Item currentitem, long paidamount, long currentbalance) {
		List<Coin> co=Collections.emptyList();
		if(paidamount-currentitem.getPrice() > 0) {
			long balance=paidamount-currentitem.getPrice();
			co=getchange(balance);
		}
		
		return co;
	}

}
