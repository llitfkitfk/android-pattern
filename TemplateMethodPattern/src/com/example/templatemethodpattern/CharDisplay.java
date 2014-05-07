package com.example.templatemethodpattern;

public class CharDisplay extends AbstractDisplay {

	private char ch;
	
	public CharDisplay(char ch) {
		this.ch = ch;
	}
	
	@Override
	public String open() {
		return "<<";
	}

	@Override
	public String print() {
		return String.valueOf(ch);
	}

	@Override
	public String close() {
		return ">>";
	}

}
