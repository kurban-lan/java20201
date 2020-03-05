package cpu;
import main.Zujian;

public class CPU implements Zujian {
	
	public String name;
	public String coreNum;
	public int price;
	
	public CPU() {
		super();
	}

	public CPU(String name, String coreNum, int price) {
		super();
		this.name = name;
		this.coreNum = coreNum;
		this.price = price;
	}

	@Override
	public String toString() {
		return "CPU [name=" + name + ", coreNum=" + coreNum + ", price=" + price + "]";
	}

	public void work() {
		System.out.println(name+"work");
	};
}
