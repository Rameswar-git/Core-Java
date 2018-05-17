package CompleteInterview.vendingmechine;

import java.util.List;



public class VendingMechineimpl implements VendingMechine {
	private Inventory<Item> items = new Inventory<>();
	private Inventory<Coin> coins = new Inventory<>();

	Item currentitem;
	long paidamount;
	long totalsalesamount;
	long currentbalance;
	
	VendingMechineimpl(){
		for (Coin c:Coin.values()) {
			coins.put(c, 5);;
		}
		for (Item i:Item.values()) {
			items.put(i, 5);
		}
	}

	@Override
	public int Selectitemanandgetprice(Item it) throws Exception {
	    if(items.hasitem(it)) {
	    	currentitem=it;
	    	return currentitem.getPrice();
	    }
	    throw new Exception(" This item has bbem sold out");
	}

	@Override
	public void insertcoin(Coin c) {
		paidamount+=c.getDenomination();
		totalsalesamount+=c.getDenomination();
		currentbalance=paidamount+currentbalance;
		coins.additem(c);
	}

	@Override
	public Bucket<Item, List<Coin>> collectitemandprice() throws Exception {
		Item itm=VendingMechineUtill.getitem(currentbalance, paidamount, currentitem);
		
		List<Coin> coins=VendingMechineUtill.getbalanceamount(currentitem, paidamount, currentbalance);
		
		return new Bucket<>(itm,coins);
	}

	public Inventory<Item> getItems() {
		return items;
	}

	public void setItems(Inventory<Item> items) {
		this.items = items;
	}

	public Inventory<Coin> getCoins() {
		return coins;
	}

	public void setCoins(Inventory<Coin> coins) {
		this.coins = coins;
	}

}
