package ProducerAndConsumer;

public class Hosting {
   
	private int id;
	private String Name;
	private long websites;
	
	Hosting(int id,String nm,long web){
		this.id=id;
		this.Name=nm;
		this.websites=web;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public long getWebsites() {
		return websites;
	}

	public void setWebsites(long websites) {
		this.websites = websites;
	}

	@Override
	public String toString() {
		return "Hosting [id=" + id + ", Name=" + Name + ", websites=" + websites + "]";
	}
	
}
