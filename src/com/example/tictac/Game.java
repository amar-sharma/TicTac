package com.example.tictac;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

@SuppressLint("NewApi")
public class Game extends Activity implements OnClickListener {

	ImageButton ib[][] = new ImageButton[3][3];
	Button back ;
	TextView display;
	int in1, in2, click = 0;
	int gameMatrix[][] = new int[3][3];
	String s;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		// TODO Full Screen
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.game);
		init();
	}

	@Override
	public void onClick(View v) {

		if(v.getId()==R.id.bBack)
		{
			finish();
		}
		if (click % 2 == 0) {
			switch (v.getId()) {
			case R.id.ib00:
				if (gameMatrix[0][0] == 0) {
					click++;
					ib[0][0].setBackgroundResource(R.drawable.box_o);
					gameMatrix[0][0] = 1;
					checkForFull(click);
					if (click > 4)
						checkForWin();
				}
				break;
			case R.id.ib01:
				if (gameMatrix[0][1] == 0) {
					click++;
					ib[0][1].setBackgroundResource(R.drawable.box_o);
					gameMatrix[0][1] = 1;
					checkForFull(click);
					if (click > 4)
						checkForWin();
				}
				break;
			case R.id.ib02:
				if (gameMatrix[0][2] == 0) {
					click++;
					ib[0][2].setBackgroundResource(R.drawable.box_o);
					gameMatrix[0][2] = 1;
					checkForFull(click);
					if (click > 4)
						checkForWin();
				}
				break;
			case R.id.ib10:
				if (gameMatrix[1][0] == 0) {
					click++;
					ib[1][0].setBackgroundResource(R.drawable.box_o);
					gameMatrix[1][0] = 1;
					checkForFull(click);
					if (click > 4)
						checkForWin();
				}
				break;
			case R.id.ib11:
				if (gameMatrix[1][1] == 0) {
					click++;
					ib[1][1].setBackgroundResource(R.drawable.box_o);
					gameMatrix[1][1] = 1;
					checkForFull(click);
					if (click > 4)
						checkForWin();
				}
				break;
			case R.id.ib12:
				if (gameMatrix[1][2] == 0) {
					click++;
					ib[1][2].setBackgroundResource(R.drawable.box_o);
					gameMatrix[1][2] = 1;
					checkForFull(click);
					if (click > 4)
						checkForWin();
				}
				break;
			case R.id.ib20:
				if (gameMatrix[2][0] == 0) {
					click++;
					ib[2][0].setBackgroundResource(R.drawable.box_o);
					gameMatrix[2][0] = 1;
					checkForFull(click);
					if (click > 4)
						checkForWin();
				}
				break;
			case R.id.ib21:
				if (gameMatrix[2][1] == 0) {
					click++;
					ib[2][1].setBackgroundResource(R.drawable.box_o);
					gameMatrix[2][1] = 1;
					checkForFull(click);
					if (click > 4)
						checkForWin();
				}
				break;
			case R.id.ib22:
				if (gameMatrix[2][2] == 0) {
					click++;
					ib[2][2].setBackgroundResource(R.drawable.box_o);
					gameMatrix[2][2] = 1;
					checkForFull(click);
					if (click > 4)
						checkForWin();
				}
				break;
			}
		} else {

			switch (v.getId()) {
			case R.id.ib00:
				if (gameMatrix[0][0] == 0) {
					click++;
					ib[0][0].setBackgroundResource(R.drawable.box_x);
					gameMatrix[0][0] = 4;
					checkForFull(click);
					if (click > 4)
						checkForWin();

				}
				break;
			case R.id.ib01:
				if (gameMatrix[0][1] == 0) {
					click++;
					ib[0][1].setBackgroundResource(R.drawable.box_x);
					gameMatrix[0][1] = 4;
					checkForFull(click);
					if (click > 4)
						checkForWin();

				}
				break;
			case R.id.ib02:
				if (gameMatrix[0][2] == 0) {
					click++;
					ib[0][2].setBackgroundResource(R.drawable.box_x);
					gameMatrix[0][2] = 4;
					checkForFull(click);
					if (click > 4)
						checkForWin();

				}
				break;
			case R.id.ib10:
				if (gameMatrix[1][0] == 0) {
					click++;
					ib[1][0].setBackgroundResource(R.drawable.box_x);
					gameMatrix[1][0] = 4;
					checkForFull(click);
					if (click > 4)
						checkForWin();

				}
				break;
			case R.id.ib11:
				if (gameMatrix[1][1] == 0) {
					click++;
					ib[1][1].setBackgroundResource(R.drawable.box_x);
					gameMatrix[1][1] = 4;
					checkForFull(click);
					if (click > 4)
						checkForWin();

				}
				break;
			case R.id.ib12:
				if (gameMatrix[1][2] == 0) {
					click++;
					ib[1][2].setBackgroundResource(R.drawable.box_x);
					gameMatrix[1][2] = 4;
					checkForFull(click);
					checkForFull(click);
					if (click > 4)
						checkForWin();

				}
				break;
			case R.id.ib20:
				if (gameMatrix[2][0] == 0) {
					click++;
					ib[2][0].setBackgroundResource(R.drawable.box_x);
					gameMatrix[2][0] = 4;
					checkForFull(click);
					if (click > 4)
						checkForWin();

				}
				break;
			case R.id.ib21:
				if (gameMatrix[2][1] == 0) {
					click++;
					ib[2][1].setBackgroundResource(R.drawable.box_x);
					gameMatrix[2][1] = 4;
					checkForFull(click);
					if (click > 4)
						checkForWin();

				}
				break;
			case R.id.ib22:
				if (gameMatrix[2][2] == 0) {
					click++;
					ib[2][2].setBackgroundResource(R.drawable.box_x);
					gameMatrix[2][2] = 4;
					checkForFull(click);
					if (click > 4)
						checkForWin();

				}
				break;
			}
		}
	}

	private void checkForFull(int c) {
		// TODO Auto-generated method stub
		if (c < 9) {
			if (c % 2 == 0)
				display.setText("O's Turn");
			else
				display.setText("X's Turn");

		} else {
			display.setText("Match Draw !!");
			soja();
		}

	}

	private void soja() {
		Thread timer = new Thread() {
			public void run() {
				try {
					sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					Intent i = new Intent("com.example.tictac.GAME");
					startActivity(i);
				}
			}
		};
		timer.start();
	}

	private void checkForWin() {
		// TODO Auto-generated method stub
		int NumberofD1 = 0, NumberofD2 = 0;
		int NumberofH[] = { 0, 0, 0 };
		int NumberofV[] = { 0, 0, 0 };
		for (in1 = 0; in1 < 3; in1++) {
			NumberofD1 += gameMatrix[in1][in1];
			for (in2 = 0; in2 < 3; in2++) {
				NumberofH[in1] += gameMatrix[in1][in2];
				NumberofV[in1] += gameMatrix[in2][in1];
			}
		}
		NumberofD2 = gameMatrix[0][2] + gameMatrix[1][1] + gameMatrix[2][0];

		switch (NumberofD1) {
		case 3:
			display.setText("O won Diagonaly Up");
			display.setGravity(Gravity.CENTER);
			soja();
			break;
		case 12:
			display.setText("X won Diagonaly Up");
			soja();
			break;
		default:
			break;
		}
		switch (NumberofD2) {
		case 3:
			display.setText("O won Diagonaly Down");
			soja();
			break;
		case 12:
			display.setText("X won Diagonaly Down");
			soja();
			break;
		default:
			break;
		}
		for (in1 = 0; in1 < 3; in1++) {
			switch (NumberofH[in1]) {
			case 3:
				display.setText("O won at Row " + (in1 + 1));
				soja();
				break;
			case 12:
				display.setText("X won at Row " + (in1 + 1));
				soja();
				break;
			default:
				break;
			}
			switch (NumberofV[in1]) {
			case 3:
				display.setText("O won at Column " + (in1 + 1));
				soja();
				break;
			case 12:
				display.setText("X won at Column " + (in1 + 1));
				soja();
				break;
			default:
				break;
			}
		}
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}

	public void init()

	{
		ib[0][0] = (ImageButton) findViewById(R.id.ib00);
		ib[0][1] = (ImageButton) findViewById(R.id.ib01);
		ib[0][2] = (ImageButton) findViewById(R.id.ib02);
		ib[1][0] = (ImageButton) findViewById(R.id.ib10);
		ib[1][1] = (ImageButton) findViewById(R.id.ib11);
		ib[1][2] = (ImageButton) findViewById(R.id.ib12);
		ib[2][0] = (ImageButton) findViewById(R.id.ib20);
		ib[2][1] = (ImageButton) findViewById(R.id.ib21);
		ib[2][2] = (ImageButton) findViewById(R.id.ib22);
		back = (Button) findViewById(R.id.bBack);
		for (in1 = 0; in1 < 3; in1++)
			for (in2 = 0; in2 < 3; in2++)
				ib[in1][in2].setOnClickListener(this);
		back.setOnClickListener(this);
		display = (TextView) findViewById(R.id.tV);
	}
}
