
public class Main {

	public static void main(String[] args) {
		CPU cpu = new CPU("Intel���i5",6,1199);
		NeiCun neicun1 = new NeiCun("����DDR4",4,168);
		NeiCun neicun2 = new NeiCun("����DDR4",8,293);
		NeiCun neicun3 = new NeiCun("����DDR4",16,548);
		YingPan yinpan = new YingPan("��������C2000 PRO",512,599);
		ZhuBan zhuban = new ZhuBan("��˶B360����",360,1999);
		
		Computer computer1 = new Computer("�����ʼǱ�",cpu,neicun1,yinpan,zhuban);
		Computer computer2 = new Computer("�м��ñʼǱ�",cpu,neicun2,yinpan,zhuban);
		Computer computer3 = new Computer("�߼��ñʼǱ�",cpu,neicun3,yinpan,zhuban);
		
		ComputerStore computerStore = new ComputerStore(computer1,computer2,computer3);
		
//		computer1.computerDescription();
		computerStore.ListOfComputerMerchandise();
		
	}

}
