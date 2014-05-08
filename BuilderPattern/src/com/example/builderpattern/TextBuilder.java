package com.example.builderpattern;

public class TextBuilder extends Builder {

	private StringBuffer buffer = new StringBuffer();
	
	@Override
	public void makeTitle(String title) {
		buffer.append("==========\n");
		buffer.append(title + "\n");
	}

	@Override
	public void makeString(String str) {
		buffer.append(str + "\n");
	}

	@Override
	public void makeItems(String[] items) {
		for (String string : items) {
			buffer.append(string +"\n");
		}
	}

	@Override
	public Object getResult() {
		buffer.append("=============\n");
		return buffer.toString();
	}

}
