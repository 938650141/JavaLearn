package com.coin.part.type;

import com.coin.concept.*;

public abstract class Disk extends Component implements Workable {
	protected int volume;
	
	public Disk(String name, double price, int volume) {
		super(name,price);
		this.volume = volume;
	}
	
	@Override
	public String description() {
		StringBuilder diskDescriptionBuilder = new StringBuilder();
		diskDescriptionBuilder.append(super.description())
			.append(" size(MB):{")
			.append(volume)
			.append(" MB}");
		return diskDescriptionBuilder.toString();
	}
}
