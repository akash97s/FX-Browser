package com.example.fx_browser;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity4 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity4);
		Button b1=(Button)findViewById(R.id.playstore);
		Button b2=(Button)findViewById(R.id.getjar);
		Button b3=(Button)findViewById(R.id.bsoft);
		Button b4=(Button)findViewById(R.id.b4);
	
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity4.this, "Playstore is loading..",Toast.LENGTH_LONG).show();
				Intent i=new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://play.google.com"));
				startActivity(i);
				
			}
		});
		
		
	b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity4.this, "Getjar is loading..",Toast.LENGTH_LONG).show();
				Intent i=new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://www.getjar.com"));
				startActivity(i);
				
			}
		});
	
	b3.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Toast.makeText(MainActivity4.this, "Brothersoft is loading..",Toast.LENGTH_LONG).show();
			Intent i=new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://en.brothersoft.com"));
			startActivity(i);
			
		}
	});
	b4.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			
			Intent i=new Intent(MainActivity4.this,MainActivity1.class);
			startActivity(i);
			
		}
	});
	
	}

	
}
