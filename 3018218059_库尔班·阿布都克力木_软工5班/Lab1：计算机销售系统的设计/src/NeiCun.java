
public class NeiCun implements Zujian {
	public String name;
	public int volume;
	public int price;
	
	public NeiCun() {
		super();
	}

	public NeiCun(String name, int volume, int price) {
		super();
		this.name = name;
		this.volume = volume;
		this.price = price;
	}

	public void work() {
		System.out.println(name+"work");
	};
}
