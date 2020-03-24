package com.coin.part.imp;

import com.coin.part.type.CPU;

public class AMDCPU extends CPU {
	
	public AMDCPU(String name, double price, int coreNum) {
		super(name, price, coreNum);
	}
	
	public void work() {
		System.out.println("This is AMD's cpu working");
	}
	
}
