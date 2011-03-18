package com.anddevelopers.retos.reto001;

import com.anddevelopers.retos.reto001.R;
import android.view.MenuInflater;
import android.view.Menu;
import android.util.Log;
import android.view.MenuItem;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Isaac extends Activity{ 
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.isaac);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
//	    MenuInflater inflater = getMenuInflater();
//	    inflater.inflate(R.menu.isaac_main, menu);
		menu.add(0, 1, 0, "Help");
		menu.add(0, 2, 1, "Quit");
	    return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem it){
		final String TAG = "Isaac";
		switch (it.getItemId()){
		case 1:
			Log.i(TAG, "case 1: Help");
//    		Intent intent = new Intent(Isaac.this, Isaac_help.class);
//    		startActivity(intent);
			break;
		case 2:
			Log.i(TAG, "case 2: Quit");
			System.exit(1);
			break;
		default:
			Log.i(TAG, "case default");
			break;
		}
		return super.onOptionsItemSelected(it);
	}
}