package com.example.tictac;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
	Button new_game, settings, exit;
	Class<?> ourClass;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// TODO Full Screen
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_main);
		init();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

		switch (v.getId()) {
		case R.id.bNewGame:
			Thread timer = new Thread() {
				public void run() {

					Intent i = new Intent("com.example.tictac.GAME");
					startActivity(i);

				}
			};
			timer.start();
			break;
		case R.id.bSettings:
			break;
		case R.id.bExit:
			finish();
			break;
		}

	}

	public void init() {
		new_game = (Button) findViewById(R.id.bNewGame);
		settings = (Button) findViewById(R.id.bSettings);
		exit = (Button) findViewById(R.id.bExit);
		new_game.setOnClickListener(this);
		settings.setOnClickListener(this);
		exit.setOnClickListener(this);

	}
}
