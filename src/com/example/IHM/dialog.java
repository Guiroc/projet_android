package com.example.IHM;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;

public class dialog extends Activity{
	
	@SuppressLint("NewApi") public AlertDialog dialog (String titre){
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
        return boite2.show();
	}
}
