package com.example.fx_browser;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity1);
		Button social = (Button) findViewById(R.id.social);
		Button mob = (Button) findViewById(R.id.mob);
		Button app = (Button) findViewById(R.id.app);
		social.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity1.this, " loading",
						Toast.LENGTH_LONG).show();
				Intent i = new Intent(MainActivity1.this, MainActivity2.class);
				startActivity(i);
			}
		});
		mob.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity1.this, " loading",
						Toast.LENGTH_LONG).show();
				Intent i = new Intent(MainActivity1.this, MainActivity3.class);
				startActivity(i);
			}
		});
		app.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity1.this, " loading",
						Toast.LENGTH_LONG).show();
				Intent i = new Intent(MainActivity1.this, MainActivity4.class);
				startActivity(i);
			}
		});
	}
}