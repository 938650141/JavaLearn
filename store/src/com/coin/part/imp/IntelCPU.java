package com.coin.part.imp;

import com.coin.part.type.*;

public class IntelCPU extends CPU {
	public IntelCPU(String name, double price, int coreNum) {
		super(name, price, coreNum);
	}
	
	public void work() {
		System.out.println("This is a IntelCPU is working!");
	}
}
