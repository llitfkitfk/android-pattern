package com.example.factorymethodpattern;

import java.util.Vector;

public class IDCardFactory extends Factory{

	private Vector<String> owners = new Vector<String>();
	
	@Override
	public Product createProduct(String owner) {
		return new IDCard(owner);
	}

	@Override
	public void registerProduct(Product product) {
		owners.add(((IDCard) product).getOwner());
	}
	
	public Vector<String> getOwners() {
		return owners;
	}

}
