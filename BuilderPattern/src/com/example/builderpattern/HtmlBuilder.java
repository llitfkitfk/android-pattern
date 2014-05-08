package com.example.builderpattern;

public class HtmlBuilder extends Builder {

	private String fileName;

	private StringBuffer buffer = new StringBuffer();

	@Override
	public void makeTitle(String title) {
		fileName = title + ".html";
		buffer.append(fileName);

		buffer.append("<html><head><title>" + title + "</title></head><body>");
		buffer.append("<h1>" + title + "</h1>");
	}

	@Override
	public void makeString(String str) {
		buffer.append("<p>" + str + "</p>");
	}

	@Override
	public void makeItems(String[] items) {
		buffer.append("<ul>");
		for (String string : items) {
			buffer.append("<li>"+ string + "</li>");
		}
		buffer.append("</ul>");
	}

	@Override
	public Object getResult() {
		buffer.append("</body></html>");
		return buffer.toString();
	}

}