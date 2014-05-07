package com.example.factorymethodpattern;

public class IDCard extends Product{

	private String owner;
	
	public IDCard(String owner) {
		this.owner = owner;
	}
	
	@Override
	public String create() {
		return "creat " + owner + " card";
	}

	@Override
	public String use() {
		return "user " + owner + " card";
	}
	
	public String  getOwner() {
		return owner;
	}

}
