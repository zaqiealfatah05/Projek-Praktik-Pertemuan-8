package com.example.pertemuan8;

import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.text.style.BackgroundColorSpan;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity  implements
        GestureDetector.OnGestureListener,
        GestureDetector.OnDoubleTapListener {

    private TextView gestureText;
    private GestureDetectorCompat gDetector;
    RelativeLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gestureText =
                (TextView) findViewById(R.id.gestureStatusText);
        this.gDetector = new GestureDetectorCompat(this, this);
        gDetector.setOnDoubleTapListener(this);

        layout=(RelativeLayout)findViewById(R.id.activitymain);
        layout.setBackgroundColor(Color.WHITE);

    }

    @Override
    public boolean onDown(MotionEvent event) {
        gestureText.setText("onDown");
        layout=(RelativeLayout)findViewById(R.id.activitymain);
        layout.setBackgroundColor(Color.YELLOW);
        return true;
    }

    @Override
    public boolean onFling(MotionEvent event1, MotionEvent event2, float velocityX, float velocityY) {
        gestureText.setText("onFling");
        layout=(RelativeLayout)findViewById(R.id.activitymain);
        layout.setBackgroundColor(Color.BLACK);
        return true;
        //boolean result = false;
        //float diffY = event2.getY() - event1.getY();
        //float diffX = event2.getX() - event1.getX();
        //if(Math.abs(diffX)>Math.abs(diffY)){
          //  if(Math.abs(diffX)> SWIPE_THRESHOLD
            //&& Math.abs(velocityX)> SWIPE_VELOCITY_THRESHOLD)
    }

    @Override
    public void onLongPress(MotionEvent event) {
        gestureText.setText("onLongPress");
        layout=(RelativeLayout)findViewById(R.id.activitymain);
        layout.setBackgroundColor(Color.RED);
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2,
                            float distanceX, float distanceY) {
        gestureText.setText("onScroll");
        layout=(RelativeLayout)findViewById(R.id.activitymain);
        layout.setBackgroundColor(Color.GREEN);
        return true;
    }

    @Override
    public void onShowPress(MotionEvent event) {
        gestureText.setText("onShowPress");
        layout=(RelativeLayout)findViewById(R.id.activitymain);
        layout.setBackgroundColor(Color.DKGRAY);
    }

    @Override
    public boolean onSingleTapUp(MotionEvent event) {
        gestureText.setText("onSingleTapUp");
        layout=(RelativeLayout)findViewById(R.id.activitymain);
        layout.setBackgroundColor(Color.LTGRAY);
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent event) {
        gestureText.setText("onDoubleTap");
        layout=(RelativeLayout)findViewById(R.id.activitymain);
        layout.setBackgroundColor(Color.CYAN);
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent event) {
        gestureText.setText("onDoubleTapEvent");
        layout=(RelativeLayout)findViewById(R.id.activitymain);
        layout.setBackgroundColor(Color.BLUE);
        return true;
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent event) {
        gestureText.setText("onSingleTapConfirmed");
        layout=(RelativeLayout)findViewById(R.id.activitymain);
        layout.setBackgroundColor(Color.TRANSPARENT);
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
