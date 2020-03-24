package com.coin.concept;

public abstract class Component {

	private double price;
	private String name;
	
	public Component(String name, double price) {
		this.price = price;
		this.name = name;
	}
	
	public String description() {
		StringBuilder descriptionBuilder = new StringBuilder();
		descriptionBuilder.append("Name:{")
			.append(name)
			.append("}; Price:{")
			.append(price)
			.append("};");
		return descriptionBuilder.toString();
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
