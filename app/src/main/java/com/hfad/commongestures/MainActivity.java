package com.hfad.commongestures;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener {
   private String TAG=MainActivity.class.getSimpleName();
   private TextView tvGestures;
   private GestureDetectorCompat gDetector;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        Log.i(TAG,"Starting onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvGestures=(TextView)findViewById(R.id.tvGestures);
       gDetector=new GestureDetectorCompat(this,this);
    }

    @Override
    public boolean onDown(MotionEvent e)
    {
        Log.i(TAG,"Starting onDown");
        tvGestures.setText("Starting onDown");
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e)
    {
        Log.i(TAG,"Starting onShowPress");
        tvGestures.setText("Starting onShowPress");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e)
    {
        Log.i(TAG,"Starting onSingleTapUp");
        tvGestures.setText("Starting onSingleTapUp");
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY)
    {
        Log.i(TAG,"Starting onScroll");
        tvGestures.setText("Starting onScroll");
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e)
    {
        Log.i(TAG,"Starting onLongPress");
        tvGestures.setText("Starting onLongPress");

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY)
    {
        Log.i(TAG,"Starting onFling");
        tvGestures.setText("Starting onFling");
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        gDetector.onTouchEvent(event);
        return super.onTouchEvent(event);

    }
}
