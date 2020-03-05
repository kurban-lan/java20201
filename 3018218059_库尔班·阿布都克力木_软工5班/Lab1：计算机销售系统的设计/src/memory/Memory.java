package memory;
import main.Zujian;

public class Memory implements Zujian {
	public String name;
	public int volume;
	public int price;

	public Memory() {
		super();
	}

	public Memory(String name, int volume, int price) {
		super();
		this.name = name;
		this.volume = volume;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Memory [name=" + name + ", volume=" + volume + ", price=" + price + "]";
	}

	public void work() {
		System.out.println(name+"work");
	};
}
