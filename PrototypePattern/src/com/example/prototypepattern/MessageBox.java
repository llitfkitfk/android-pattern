package com.example.prototypepattern;

public class MessageBox implements Product {

	private char decochar;
	
	public MessageBox(char dechar) {
		this.decochar = dechar;
	}
	
	@Override
	public String use(String s) {
		int length = s.getBytes().length;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length+4; i++) {
			sb.append(decochar);
		}
		
		sb.append(decochar +"\n  \""+ s+"\"\n"+decochar );
		
		for (int i = 0; i < length+4; i++) {
			sb.append(decochar);
		}
		sb.append("");
		return sb.toString();
	}

	@Override
	public Product createClone() {
		Product product = null;
		try {
			product = (Product) clone();
		} catch (Exception e) {
		}
		return product;
	}

}
