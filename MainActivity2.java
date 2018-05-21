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

public class MainActivity2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity2);
		Button b1=(Button)findViewById(R.id.google);
		Button b2=(Button)findViewById(R.id.yahoo);
		Button b3=(Button)findViewById(R.id.fb);
		Button b4=(Button)findViewById(R.id.twitter);
		Button b5=(Button)findViewById(R.id.gmail);
		Button b6=(Button)findViewById(R.id.youtube);
		Button b7=(Button)findViewById(R.id.bing);
		Button b8=(Button)findViewById(R.id.picasa);
		Button b9=(Button)findViewById(R.id.b2);
		
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity2.this, "Google is loading..",Toast.LENGTH_LONG).show();
				Intent i=new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://www.google.co.in"));
				startActivity(i);
				
			}
		});
	b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity2.this, "Yahoo is loading..",Toast.LENGTH_LONG).show();
				Intent i=new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://www.yahoo.com"));
				startActivity(i);
				
			}
		});
	b3.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Toast.makeText(MainActivity2.this, "Facebook is loading..",Toast.LENGTH_LONG).show();
			Intent i=new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://www.facebook.com"));
			startActivity(i);
			
		}
	});
	b4.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Toast.makeText(MainActivity2.this, "Twitter is loading..",Toast.LENGTH_LONG).show();
			Intent i=new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://www.twitter.com"));
			startActivity(i);
			
		}
	});
	b5.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Toast.makeText(MainActivity2.this, "Gmail is loading..",Toast.LENGTH_LONG).show();
			Intent i=new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://mail.google.com"));
			startActivity(i);
			
		}
	});
	b6.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Toast.makeText(MainActivity2.this, "Youtube is loading..",Toast.LENGTH_LONG).show();
			Intent i=new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://www.youtube.com"));
			startActivity(i);
			
		}
	});
	b7.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Toast.makeText(MainActivity2.this, "Bing is loading..",Toast.LENGTH_LONG).show();
			Intent i=new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://www.bing.com"));
			startActivity(i);
			
		}
	});
	b8.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Toast.makeText(MainActivity2.this, "Picasa is loading..",Toast.LENGTH_LONG).show();
			Intent i=new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://picasaweb.google.com"));
			startActivity(i);
			
		}
	});
	b9.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			
			Intent i=new Intent(MainActivity2.this,MainActivity1.class);
			startActivity(i);
			
		}
	});
	}

	

}
