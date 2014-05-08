package com.example.prototypepattern;

import java.util.Hashtable;

public class Manager {
	private Hashtable<String, Product> showCase = new Hashtable<String, Product>();
	public void register(String name, Product product) {
		showCase.put(name, product);
	}
	
	public Product create(String photoName) {
		Product product = showCase.get(photoName);
		return product.createClone();
	}
}
