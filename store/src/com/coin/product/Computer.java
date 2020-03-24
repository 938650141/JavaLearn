package com.coin.product;

import com.coin.concept.Component;
import com.coin.concept.Workable;
import com.coin.part.type.CPU;
import com.coin.part.type.Disk;

/**
 * Computer �����
 * @author Tom
 *
 */
public class Computer extends Component implements Workable {

	private CPU cpu;
	private Disk disk;
	
	public Computer(String name, CPU cpu, Disk disk){
		super(name, -1);
		this.cpu = cpu;
		this.disk = disk;
		super.setPrice(cpu.getPrice() + disk.getPrice());
	}
	
	/**
	 * work() ����Computer�и���������ִ��˳��
	 */
	public void work() {
		cpu.work();
		disk.work();
	}

	public String description() {
		StringBuilder cmputerDescBuilder = new StringBuilder();
		cmputerDescBuilder.append(super.description())
			.append("\nCPU description: {")
			.append(cpu.description())
			.append("}")
			.append("; \nDisk descripton: {")
			.append(disk.description())
			.append("}");
		return cmputerDescBuilder.toString();
		
	}
}
