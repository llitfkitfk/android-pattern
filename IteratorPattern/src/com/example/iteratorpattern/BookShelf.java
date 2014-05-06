package com.example.iteratorpattern;

public class BookShelf implements Aggregate {

	private Book[] books;
	private int last = 0;

	public BookShelf(int maxSize) {
		this.books = new Book[maxSize];
	}

	public Book getBookAt(int index) {
		return books[index];
	}

	public BookShelf appendBook(Book book) {
		this.books[last] = book;
		last++;
		return this;
	}

	@Override
	public Iterator iterator() {

		return new BookShelfIterator(this);
	}

	public int getLength() {
		return this.last;
	}

}
