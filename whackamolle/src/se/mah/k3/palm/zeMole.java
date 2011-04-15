package se.mah.k3.palm;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.Button;

public class zeMole extends Button {
	boolean alive = false;
	List<Integer> myList;

	public zeMole(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		this.setText("");
		myList = new ArrayList<Integer>();
		myList.add(R.drawable.mole);
		myList.add(R.drawable.mole1);
		setImage();
	}

	public void setImage() {
		// TODO Auto-generated method stub
		if (alive) {
			alive = false;
			this.setBackgroundResource(myList.get(0));
			invalidate();
		} else {
			alive = true;
			this.setBackgroundResource(myList.get(1));
			invalidate();
		}

	}

	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
	}

}

