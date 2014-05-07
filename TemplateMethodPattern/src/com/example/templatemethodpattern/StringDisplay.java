package com.example.templatemethodpattern;


public class StringDisplay extends AbstractDisplay{

	private String string;
	private int width;

	public StringDisplay(String string) {
		this.string = string;
		this.width = this.string.length();
	}
	
	@Override
	public String open() {
		return printLine();
	}

	private String printLine() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < width; i++) {
			sb.append("*");
		}
			return sb.toString() + "\n";
	}

	@Override
	public String print() {
		return "|"+ string + "|\n";
	}

	@Override
	public String close() {
		return printLine();
	}

}
