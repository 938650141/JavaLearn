package com.coin.part.imp;

import com.coin.part.type.Disk;

/**
 * WestDigital ��������Ӳ����
 * @author Tom
 *
 */
public class WestDigital extends Disk {

	public WestDigital(String name, double price, int volume) {
		super(name, price, volume);
	}

	public void work() {
		System.out.println("This is westdigital disk working");
	}
	
}
