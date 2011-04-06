package se.ke.mah.palm.johan.uppg2;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class main extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //To listen for buttonclicks we have to tell the button that we want to listen
        //find the button
        Button button = (Button) findViewById(R.id.button1);
        //tell the button that we want to listen (call onClick when button is invoked)
        button.setOnClickListener(this);
      
        Context context = getApplicationContext();
        CharSequence text = "Hello toast!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
  
    }
    public void onClick(View v) {
		// perform action on click
		//Get the text
		EditText text = (EditText) findViewById(R.id.editText2);
		Toast t = Toast.makeText(this, R.id.editText2, Toast.LENGTH_LONG);
		t.show();	
    }
}