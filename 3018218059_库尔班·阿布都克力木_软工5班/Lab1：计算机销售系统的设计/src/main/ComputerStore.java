package main;

public class ComputerStore {
	
	public Computer computer1;
	public Computer computer2;
	public Computer computer3;
	
	public ComputerStore() {
		super();
	}

	public ComputerStore(Computer computer1, Computer computer2, Computer computer3) {
		super();
		this.computer1 = computer1;
		this.computer2 = computer2;
		this.computer3 = computer3;
	}

	//计算机商品一览表
	public void ListOfComputerMerchandise() {
		System.out.println("-----计算机商品一览表-----");
		System.out.println("Computer name:"+computer1.name);
		computer1.computerDescription();//计算机的描述
		System.out.println("总价格为："+computer1.sumPrice());//价格
		computer1.cpu.work();//工作
		computer1.memory.work();
		computer1.disk.work();
		computer1.board.work();
		
		System.out.println("---------------------");
		System.out.println("Computer name:"+computer2.name);
		computer2.computerDescription();//计算机的描述
		System.out.println("总价格为："+computer2.sumPrice());//价格
		computer2.cpu.work();//工作
		computer2.memory.work();
		computer2.disk.work();
		computer2.board.work();
		
		System.out.println("---------------------");
		System.out.println("Computer name:"+computer3.name);
		computer3.computerDescription();//计算机的描述
		System.out.println("总价格为："+computer3.sumPrice());//价格
		computer3.cpu.work();//工作
		computer3.memory.work();
		computer3.disk.work();
		computer3.board.work();
		
	}
}
