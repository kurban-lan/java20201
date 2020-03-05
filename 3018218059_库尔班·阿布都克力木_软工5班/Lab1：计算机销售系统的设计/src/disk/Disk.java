package disk;
import main.Zujian;

public class Disk implements Zujian {
	public String name;
	public int volume;
	public int price;
	
	public Disk() {
		super();
	}

	public Disk(String name, int volume, int price) {
		super();
		this.name = name;
		this.volume = volume;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Disk [name=" + name + ", volume=" + volume + ", price=" + price + "]";
	}

	public void work() {
		System.out.println(name+"work");
	};
}
