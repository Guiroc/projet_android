package com.example.IHM;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class classe extends Activity{
	ListView mListView;
	String[] prenoms = new String[]{
	         "Antoine", "Benoit", "Cyril", "David", "Eloise", "Florent",
	         "Gerard", "Hugo", "Ingrid", "Jonathan", "Kevin", "Logan",
	         "Mathieu", "Noemie", "Olivia", "Philippe", "Quentin", "Romain",
	         "Sophie", "Tristan", "Ulric", "Vincent", "Willy", "Xavier",
	         "Yann", "Zoé"
	    };
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.classe);
        TextView retourClasse = (TextView) findViewById(R.id.retourClasse);
        retourClasse.setOnClickListener(quitterListener);
        TextView ajoutClasse = (TextView) findViewById(R.id.ajoutClasse);
        ajoutClasse.setOnClickListener(ouvrir);
        
        
        mListView = (ListView) findViewById(R.id.listView);
        
        //android.R.layout.simple_list_item_1 est une vue disponible de base dans le SDK android,
        //Contenant une TextView avec comme identifiant "@android:id/text1"
 
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(classe.this,
        android.R.layout.simple_list_item_1, prenoms);
        mListView.setAdapter(adapter);
    } 
	
	
	private OnClickListener quitterListener = new OnClickListener(){
    	public void onClick(View v){
    		finish();
    	}
    };
    
    private OnClickListener ouvrir = new OnClickListener(){
		public void onClick(View v) {
			//showDialog(0);
			dialog unefenetre = new dialog();
			unefenetre.dialog("classe");
		}
    };	
    @SuppressLint("NewApi") public void dialog (String titre){
		AlertDialog.Builder boite2;
        boite2 = new AlertDialog.Builder(this);
        boite2.setView(R.layout.interact);
        boite2.setTitle(titre);
        
        boite2.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
         	   
            }
        });
        
        boite2.setNegativeButton("Annuler", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
         	   
            }
        });
        
        boite2.setNeutralButton("Supprimer", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
         	   
            }
        });
        boite2.show();
	}

    
    private void finishThisActivity(){
    	this.finish();
}
  };
    
    
     