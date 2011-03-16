package com.anddevelopers.retos.reto001;

import com.anddevelopers.retos.reto001.R;
import android.view.MenuInflater;
import android.view.Menu;

import android.app.Activity;
import android.os.Bundle;

public class Isaac extends Activity{ 
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.isaac);
	}
	
//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//	    MenuInflater inflater = getMenuInflater();
//	    inflater.inflate(R.menu.isaac_main, menu);
//	    return true;
//	}
}