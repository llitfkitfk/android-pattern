package com.example.prototypepattern;

public interface Product extends Cloneable {

	public abstract String use(String s);
	public abstract Product createClone();
}
