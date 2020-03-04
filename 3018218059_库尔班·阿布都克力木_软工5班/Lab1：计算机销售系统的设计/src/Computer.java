
public class Computer {
	
	public String name;
	
	CPU cpu = new CPU();
	NeiCun neicun = new NeiCun();
	YingPan yingpan = new YingPan();
	ZhuBan zhuban = new ZhuBan();
	
	public Computer() {
		super();
	}

	public Computer(String name, CPU cpu, NeiCun neicun, YingPan yingpan, ZhuBan zhuban) {
		super();
		this.name = name;
		this.cpu = cpu;
		this.neicun = neicun;
		this.yingpan = yingpan;
		this.zhuban = zhuban;
	}

	//计算机描述
	public void computerDescription() {
		System.out.println("CPU:"+cpu.name);
		System.out.println("内存名:"+neicun.name);
		System.out.println("硬盘名:"+yingpan.name);
		System.out.println("主板名:"+zhuban.name);
	}
	
	public int sumPrice() {
		return cpu.price+neicun.price+yingpan.price+zhuban.price;
	}
}
