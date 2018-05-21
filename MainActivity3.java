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

public class MainActivity3 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity3);
		Button b1=(Button)findViewById(R.id.apple);
		Button b2=(Button)findViewById(R.id.htc);
		Button b3=(Button)findViewById(R.id.bb);
		Button b4=(Button)findViewById(R.id.samsung);
		Button b5=(Button)findViewById(R.id.sony);
		Button b6=(Button)findViewById(R.id.nokia);
		Button b7=(Button)findViewById(R.id.b3);
		
		
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity3.this, "Apple is loading..",Toast.LENGTH_LONG).show();
				Intent i=new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://www.apple.com"));
				startActivity(i);
				
			}
		});
	b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity3.this, "Htc is loading..",Toast.LENGTH_LONG).show();
				Intent i=new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://www.htc.com"));
				startActivity(i);
				
			}
		});
	b3.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Toast.makeText(MainActivity3.this, "Blackberry is loading..",Toast.LENGTH_LONG).show();
			Intent i=new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://in.blackberry.com"));
			startActivity(i);
			
		}
	});
	b4.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Toast.makeText(MainActivity3.this, "Samsung is loading..",Toast.LENGTH_LONG).show();
			Intent i=new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://www.samsung.com"));
			startActivity(i);
			
		}
	});
	b5.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Toast.makeText(MainActivity3.this, "Sony is loading..",Toast.LENGTH_LONG).show();
			Intent i=new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://www.sony.co.in"));
			startActivity(i);
			
		}
	});
	b6.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Toast.makeText(MainActivity3.this, "Nokia is loading..",Toast.LENGTH_LONG).show();
			Intent i=new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://www.nokia.com"));
			startActivity(i);
			
		}
	});
	b7.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			
			Intent i=new Intent(MainActivity3.this,MainActivity1.class);
			startActivity(i);
			
		}
	});
	}

	

}
