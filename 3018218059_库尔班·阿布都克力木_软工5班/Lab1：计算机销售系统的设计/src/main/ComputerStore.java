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

	//�������Ʒһ����
	public void ListOfComputerMerchandise() {
		System.out.println("-----�������Ʒһ����-----");
		System.out.println("Computer name:"+computer1.name);
		computer1.computerDescription();//�����������
		System.out.println("�ܼ۸�Ϊ��"+computer1.sumPrice());//�۸�
		computer1.cpu.work();//����
		computer1.memory.work();
		computer1.disk.work();
		computer1.board.work();
		
		System.out.println("---------------------");
		System.out.println("Computer name:"+computer2.name);
		computer2.computerDescription();//�����������
		System.out.println("�ܼ۸�Ϊ��"+computer2.sumPrice());//�۸�
		computer2.cpu.work();//����
		computer2.memory.work();
		computer2.disk.work();
		computer2.board.work();
		
		System.out.println("---------------------");
		System.out.println("Computer name:"+computer3.name);
		computer3.computerDescription();//�����������
		System.out.println("�ܼ۸�Ϊ��"+computer3.sumPrice());//�۸�
		computer3.cpu.work();//����
		computer3.memory.work();
		computer3.disk.work();
		computer3.board.work();
		
	}
}
