package com.anddevelopers.retos.reto001;

import com.anddevelopers.retos.reto001.R;
import android.view.MenuInflater;
import android.view.Menu;
import android.view.View;
import android.util.Log;
import android.view.MenuItem;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.content.Context;


public class Isaac extends Activity{ 
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.isaac);
		
		 final Button isaac_main_button1 = (Button)findViewById(R.id.isaac_main_button1);
	        
	     isaac_main_button1.setOnClickListener(new Button.OnClickListener(){
	     public void onClick(final View v){
	    	 Context context = getApplicationContext();
	    	 CharSequence text = "Hello toast notification!";
	    	 int duration = Toast.LENGTH_SHORT;
	    	 
	    	 Toast toast = Toast.makeText(context, text, duration);
	    	 toast.show();
	     	}
	     });
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.isaac_main, menu);
	    return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem it){
		final String TAG = "Isaac";
		switch (it.getItemId()){
		case R.id.help:
			Log.i(TAG, "case 1: Help");
			Toast.makeText(getApplicationContext(), 
					"Help Option is Selected!", Toast.LENGTH_SHORT).show();
			break;
		case R.id.quit:
			Log.i(TAG, "case 2: Quit");
			Toast.makeText(getApplicationContext(), 
					"Quit Option is Selected!", Toast.LENGTH_SHORT).show();
			break;
		default:
			Log.i(TAG, "case default");
			break;
		}
		return super.onOptionsItemSelected(it);
	}
}