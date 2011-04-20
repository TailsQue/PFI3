package se.mah.k3.palm;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class essMess extends Activity implements OnClickListener {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		/* Button - Explicit intent */
		Button explicit = (Button) findViewById(R.id.loginbutton);
		explicit.setOnClickListener(this);

		/* Button - Implicit intent */
		//Button implicit = (Button) findViewById(R.id.getbutton);
		//implicit.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		
		switch (v.getId()) {
		case R.id.loginbutton:
			/* Launch explicit intent */
			Intent explicit = new Intent(essMess.this, essMessapp.class);
			startActivity(explicit);
			break;
		/*switch (v.getId()) {
		case R.id.loginbutton:
			/*Intent implicit = new Intent(Intent.ACTION_VIEW);
			implicit.setData(Uri.parse("http://195.178.232.26:8080/pfi3_2011/"));
			startActivity(implicit);
			break;
		}*/
		
			
			/* if (v == findViewById(R.id.sendbutton)) {
	        	EditText editText = (EditText) findViewById(R.id.editText1);
	        	EditText editText2 = (EditText) findViewById(R.id.editText2);


	        	String message = editText.getText().toString();
	        	String tag = editText2.getText().toString();
	            // display the toast pop-up window
	             Toast.makeText(this, tag + " - " + message, Toast.LENGTH_SHORT).show();
	             editText.setText("");
	             editText2.setText(""); 
	}*/
}
}
}
