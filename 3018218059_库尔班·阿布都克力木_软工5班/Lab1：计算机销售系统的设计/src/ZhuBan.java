
public class ZhuBan implements Zujian {
	public String name;
	public int speed;
	public int price;
	
	public ZhuBan() {
		super();
	}

	public ZhuBan(String name, int speed, int price) {
		super();
		this.name = name;
		this.speed = speed;
		this.price = price;
	}

	public void work() {
		System.out.println(name+"work");
	};
}
