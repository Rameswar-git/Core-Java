package ProducerAndConsumer;

import java.math.BigDecimal;

public class Item {
	
	private String name;
	private int count;
	private BigDecimal price;

	
	Item(String nm,int co,BigDecimal pr){
		this.name=nm;
		this.count=co;
		this.price=pr;
	}


	public BigDecimal getPrice() {
		return price;
	}


	public void setPrice(BigDecimal price) {
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	@Override
	public String toString() {
		return "Item [name=" + name + ", count=" + count + ", price=" + price + "]";
	}
	
	

}
