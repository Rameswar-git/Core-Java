/**
 * 
 */
package CompleteInterview.vendingmechine;

import java.util.List;

/**
 * @author Vicky
 *
 */
public interface VendingMechine {
	public int Selectitemanandgetprice(Item it) throws Exception;
	public void insertcoin(Coin c) throws Exception;
    public Bucket<Item, List<Coin>> collectitemandprice() throws Exception;
}
