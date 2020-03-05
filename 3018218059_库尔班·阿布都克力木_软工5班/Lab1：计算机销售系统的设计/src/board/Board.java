package board;
import main.Zujian;

public class Board implements Zujian {
	public String name;
	public String speed;
	public int price;
	
	public Board() {
		super();
	}

	public Board(String name, String speed, int price) {
		super();
		this.name = name;
		this.speed = speed;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Board [name=" + name + ", speed=" + speed + ", price=" + price + "]";
	}

	public void work() {
		System.out.println(name+"work");
	};
}
