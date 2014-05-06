package com.example.iteratorpattern;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.EditText;

public class IteratorPatternsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		EditText editText = (EditText) findViewById(R.id.editText1);
		BookShelf bookShelf = new BookShelf(5);
		bookShelf.appendBook(new Book("android1"))
				.appendBook(new Book("android2"))
				.appendBook(new Book("android3"))
				.appendBook(new Book("android4"))
				.appendBook(new Book("android5"));
		
		Iterator iterator = bookShelf.iterator();
		while (iterator.hasNext()) {
			Book book= (Book) iterator.next();
			editText.setText(editText.getText() + "\n" + book.getName());
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
