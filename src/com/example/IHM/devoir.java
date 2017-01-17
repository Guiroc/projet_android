package com.example.IHM;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class devoir extends Activity{

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.devoir);
        
        Button bRetour = (Button) findViewById(R.id.bRetour);
        bRetour.setOnClickListener(quitterListener);
    } 
	
	private OnClickListener quitterListener = new OnClickListener(){
    	public void onClick(View v){
    		finish();
    	}
    };
}
