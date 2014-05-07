package com.example.templatemethodpattern;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final AbstractDisplay d1 = new CharDisplay('H');
		final AbstractDisplay d2 = new StringDisplay("android test");
		
		Button result = (Button) findViewById(R.id.button1);
		final EditText etResult = (EditText) findViewById(R.id.editText1);
		
		result.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				etResult.setText(d1.display() +"\n"+ d2.display());
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
