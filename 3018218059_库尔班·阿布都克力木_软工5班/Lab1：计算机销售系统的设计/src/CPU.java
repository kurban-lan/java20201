
public class CPU implements Zujian {
	public String name;
	public int coreNum;
	public int price;
	
	public CPU() {
		super();
	}

	public CPU(String name, int coreNum, int price) {
		super();
		this.name = name;
		this.coreNum = coreNum;
		this.price = price;
	}

	public void work() {
		System.out.println(name+"work");
	};
}
