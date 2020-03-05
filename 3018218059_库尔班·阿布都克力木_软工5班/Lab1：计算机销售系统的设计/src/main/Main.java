package main;
import board.AsusBoard;
import board.Board;
import board.GigabyteBoard;
import cpu.AMDCPU;
import cpu.CPU;
import cpu.IntelCPU;
import disk.Disk;
import disk.SeagateDisk;
import disk.WestDigitalsDisk;
import memory.KingstonMemory;
import memory.Memory;
import memory.SumsungMemory;

public class Main {

	public static void main(String[] args) {
		
		CPU cpu1 = new IntelCPU("Intel", "i5", 1000);
		CPU cpu2 = new IntelCPU("Intel", "i7", 1500);
		CPU cpu3 = new AMDCPU("AMD", "R7", 1500);
		CPU cpu4 = new AMDCPU("AMD", "R6", 1000);
		
		Memory memory1 = new KingstonMemory("KingstonV1", 16, 1000);
		Memory memory2 = new KingstonMemory("KingstonV2", 32, 2000);
		Memory memory3 = new SumsungMemory("SumsungV1", 16, 1000);
		Memory memory4 = new SumsungMemory("SumsungV2", 32, 2000);
		
		Disk disk1 = new SeagateDisk("SegateDisk", 500, 1000);
		Disk disk2 = new SeagateDisk("SegateDisk", 1000, 2000);
		Disk disk3 = new WestDigitalsDisk("WestDigitals", 1000, 2000);
		Disk disk4 = new WestDigitalsDisk("WestDigitals", 500, 1000);
		
		Board board1 = new GigabyteBoard("GigabyteV1", "30Mbps", 1000);
		Board board2 = new GigabyteBoard("GigabyteV1", "60Mbps", 3000);
		Board board3 = new AsusBoard("AsusV1", "60Mbps", 3000);
		Board board4 = new AsusBoard("AsusV1", "60Mbps", 3000);
		
		Computer computer1 = new Computer("第一款",cpu1,memory1,disk1,board1);
		Computer computer2 = new Computer("第二款",cpu2,memory2,disk2,board2);
		Computer computer3 = new Computer("第三款",cpu3,memory3,disk3,board3);
		Computer computer4 = new Computer("第四款",cpu4,memory4,disk4,board4);		
		
		ComputerStore computerStore = new ComputerStore(computer1,computer2,computer3);
		
		computerStore.ListOfComputerMerchandise();
		
//		CPU cpu = new CPU("Intel酷睿i5",6,1199);
//		Memory neicun1 = new Memory("三星DDR4",4,168);
//		Memory neicun2 = new Memory("三星DDR4",8,293);
//		Memory neicun3 = new Memory("三星DDR4",16,548);
//		Disk yinpan = new Disk("海康威视C2000 PRO",512,599);
//		Board zhuban = new Board("华硕B360主板",360,1999);
//		
//		Computer computer1 = new Computer("初级笔记本",cpu,neicun1,yinpan,zhuban);
//		Computer computer2 = new Computer("中级用笔记本",cpu,neicun2,yinpan,zhuban);
//		Computer computer3 = new Computer("高级用笔记本",cpu,neicun3,yinpan,zhuban);
//		
//		ComputerStore computerStore = new ComputerStore(computer1,computer2,computer3);
//		
//
//		computerStore.ListOfComputerMerchandise();
		
	}

}
