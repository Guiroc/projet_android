package com.example.IHM;

import com.example.IHM.R.id;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button bQuitter = (Button) findViewById(R.id.bQuitter);
        bQuitter.setOnClickListener(quitterListener);
        
        Button bDevoir = (Button) findViewById(R.id.bDevoir);
        bDevoir.setOnClickListener(bDevoirListener);
        
        Button bEleve = (Button) findViewById(R.id.bEleve);
        bEleve.setOnClickListener(bEleveListener);
        
        Button bClasse = (Button) findViewById(R.id.bClasse);
        bClasse.setOnClickListener(bClasseListener);
               
        Button bMatiere = (Button) findViewById(R.id.bMatiere);
        bMatiere.setOnClickListener(bMatiereListener);           
               
	}
	
	private OnClickListener quitterListener = new OnClickListener(){
    	public void onClick(View v){
    		finish();
    	}
    };
    
    private OnClickListener bDevoirListener = new OnClickListener(){
    	public void onClick(View v){
    		Intent intent = new Intent(MainActivity.this, devoir.class);
    	    startActivity(intent);
    	}
    };
    
    private OnClickListener bEleveListener = new OnClickListener(){
    	public void onClick(View v){
    		Intent intent = new Intent(MainActivity.this, eleve.class);
    	    startActivity(intent);
    	}
    };
    
    private OnClickListener bClasseListener = new OnClickListener(){
    	public void onClick(View v){
    		Intent intent = new Intent(MainActivity.this, classe.class);
    	    startActivity(intent);
    	}
    };
    
    private OnClickListener bMatiereListener = new OnClickListener(){
    	public void onClick(View v){
    		Intent intent = new Intent(MainActivity.this, matiere.class);
    	    startActivity(intent);
    	}
    };
}
