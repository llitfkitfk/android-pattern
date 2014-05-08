package com.example.builderpattern;

public class Director {
	
	private Builder builder;
	
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public Object construct() {
		builder.makeTitle("terry");
		builder.makeString("android developer");
		builder.makeItems(new String[]{"java", "native"});
		return builder.getResult();
	}
}
