package com.example.adapterpattern;

import com.example.adapterpattern.classs.Print;
import com.example.adapterpattern.classs.PrintBanner;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class AdapterPatternActivity extends Activity {
	
	private Button one, twoButton;
	private EditText etOne, etTwo;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		one = (Button) findViewById(R.id.button1);
		twoButton = (Button) findViewById(R.id.button2);
		etOne = (EditText) findViewById(R.id.editText1);
		etTwo = (EditText) findViewById(R.id.editText2);
		
		one.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Print print = new PrintBanner("class extends");
				etOne.setText(print.printWeak() + "\n" + print.printStrong());
			}
		});
		
		twoButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				com.example.adapterpattern.object.Print print = new com.example.adapterpattern.object.PrintBanner("object extend");
				etTwo.setText(print.printWeak() + "\n" + print.printStrong());
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
