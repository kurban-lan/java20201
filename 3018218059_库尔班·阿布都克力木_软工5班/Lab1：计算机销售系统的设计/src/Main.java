
public class Main {

	public static void main(String[] args) {
		CPU cpu = new CPU("Intel酷睿i5",6,1199);
		NeiCun neicun1 = new NeiCun("三星DDR4",4,168);
		NeiCun neicun2 = new NeiCun("三星DDR4",8,293);
		NeiCun neicun3 = new NeiCun("三星DDR4",16,548);
		YingPan yinpan = new YingPan("海康威视C2000 PRO",512,599);
		ZhuBan zhuban = new ZhuBan("华硕B360主板",360,1999);
		
		Computer computer1 = new Computer("初级笔记本",cpu,neicun1,yinpan,zhuban);
		Computer computer2 = new Computer("中级用笔记本",cpu,neicun2,yinpan,zhuban);
		Computer computer3 = new Computer("高级用笔记本",cpu,neicun3,yinpan,zhuban);
		
		ComputerStore computerStore = new ComputerStore(computer1,computer2,computer3);
		
//		computer1.computerDescription();
		computerStore.ListOfComputerMerchandise();
		
	}

}
