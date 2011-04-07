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
      
   
    }
    
    /*public void onClick(View v) {
		// perform action on click
		//Get the text
		EditText text = (EditText) findViewById(R.id.editText1);
		EditText text2 = (EditText) findViewById(R.id.editText2);
		
		String s = text.getText().toString();
		String b = text2.getText().toString();
		
		Toast t = Toast.makeText(this,  b + s, Toast.LENGTH_LONG);
		t.show();
		
		EditText.setText("");
		EditText2.setText("");
		*/
    public void onClick(View view) {

        // which button is clicked?

 

        // the Toast button

        if (view == findViewById(R.id.button1)) {
        	EditText editText = (EditText) findViewById(R.id.editText1);
        	EditText editText2 = (EditText) findViewById(R.id.editText2);


        	String message = editText.getText().toString();
        	String tag = editText2.getText().toString();
            // display the toast popup window
             Toast.makeText(this, tag + " - " + message, Toast.LENGTH_SHORT).show();
             editText.setText("");
             editText2.setText(""); 

		
    }
   
}
}