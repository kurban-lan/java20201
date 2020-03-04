
public class ComputerStore {
	Computer computer1 = new Computer();
	Computer computer2 = new Computer();
	Computer computer3 = new Computer();
	
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
		computer1.computerDescription();//计算机的描述
		System.out.println("总价格为："+computer1.sumPrice());//价格
		computer1.cpu.work();//工作
		computer1.neicun.work();
		computer1.yingpan.work();
		computer1.zhuban.work();
		
		System.out.println("---------------------");
		
		computer2.computerDescription();//计算机的描述
		System.out.println("总价格为："+computer2.sumPrice());//价格
		computer2.cpu.work();//工作
		computer2.neicun.work();
		computer2.yingpan.work();
		computer2.zhuban.work();
		
		System.out.println("---------------------");
		
		computer3.computerDescription();//计算机的描述
		System.out.println("总价格为："+computer3.sumPrice());//价格
		computer3.cpu.work();//工作
		computer3.neicun.work();
		computer3.yingpan.work();
		computer3.zhuban.work();
		
	}
}
