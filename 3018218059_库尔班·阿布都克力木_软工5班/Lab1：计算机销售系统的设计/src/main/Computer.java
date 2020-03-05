package main;

import board.Board;
import cpu.CPU;
import disk.Disk;
import memory.Memory;

public class Computer{
	
	public String name;
	public CPU cpu;
	public Memory memory;
	public Disk disk;
	public Board board;
	
	public Computer() {
		super();
	}

	public Computer(String name, CPU cpu, Memory memory, Disk disk, Board board) {
		super();
		this.name = name;
		this.cpu = cpu;
		this.memory = memory;
		this.disk = disk;
		this.board = board;
	}

	@Override
	public String toString() {
		return "Computer [name=" + name + ", cpu=" + cpu + ", memory=" + memory + ", disk=" + disk + ", board=" + board
				+ "]";
	}

	//º∆À„ª˙√Ë ˆ
	public void computerDescription() {
		System.out.println(cpu.toString());
		System.out.println(memory.toString());
		System.out.println(disk.toString());
		System.out.println(board.toString());
	}
	
	public int sumPrice() {
		return cpu.price+memory.price+disk.price+board.price;
	}
}
