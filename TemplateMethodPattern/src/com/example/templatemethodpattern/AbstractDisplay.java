package com.example.templatemethodpattern;

public abstract class AbstractDisplay {
	public abstract String open();

	public abstract String print();

	public abstract String close();

	public final String display() {
		StringBuffer sb = new StringBuffer();
		sb.append(open());
		for (int i = 0; i < 5; i++) {
			sb.append(print());
		}
		sb.append(close());
		return sb.toString();
	}
}
