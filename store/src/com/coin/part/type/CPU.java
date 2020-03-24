package com.coin.part.type;

import com.coin.concept.Component;
import com.coin.concept.Workable;

public abstract class CPU extends Component implements Workable {
	protected int coreNum;
	
	public CPU(String name, double price, int coreNum) {
		super(name, price);
		this.coreNum = coreNum;
	}
	
	@Override
	public String description() {
		StringBuilder cpuDescriptionBuilder = new StringBuilder();
		cpuDescriptionBuilder.append(super.description())
			.append(" Core Num:{")
			.append(coreNum)
			.append("}");
		return cpuDescriptionBuilder.toString();
	}
}
