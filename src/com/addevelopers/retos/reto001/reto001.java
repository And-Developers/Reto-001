package com.addevelopers.retos.reto001;

import com.anddevelopers.retos.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.Context;
import android.util.Log;

public class reto001 extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        final String TAG = "reto001";
                
        final Button button_carlos = (Button) findViewById(R.id.carlos_button);
        final Button button_isaac = (Button) findViewById(R.id.isaac_button);
        
        button_isaac.setOnClickListener(new Button.OnClickListener(){
        	public void onClick(final View v){
        		Log.i(TAG, "button_isaac: onClick invoked");
        		Intent intent = new Intent(reto001.this, Isaac.class);
        		reto001.this.startActivity(intent);
        	}
        });
    }
}