
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

	//�������Ʒһ����
	public void ListOfComputerMerchandise() {
		System.out.println("-----�������Ʒһ����-----");
		computer1.computerDescription();//�����������
		System.out.println("�ܼ۸�Ϊ��"+computer1.sumPrice());//�۸�
		computer1.cpu.work();//����
		computer1.neicun.work();
		computer1.yingpan.work();
		computer1.zhuban.work();
		
		System.out.println("---------------------");
		
		computer2.computerDescription();//�����������
		System.out.println("�ܼ۸�Ϊ��"+computer2.sumPrice());//�۸�
		computer2.cpu.work();//����
		computer2.neicun.work();
		computer2.yingpan.work();
		computer2.zhuban.work();
		
		System.out.println("---------------------");
		
		computer3.computerDescription();//�����������
		System.out.println("�ܼ۸�Ϊ��"+computer3.sumPrice());//�۸�
		computer3.cpu.work();//����
		computer3.neicun.work();
		computer3.yingpan.work();
		computer3.zhuban.work();
		
	}
}
