package com.example.draw;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DemoView extends View {
	Paint paint=new Paint();
	Thread th;
	float lastx=0;
	float lasty=0;
	List<String> pixel = new ArrayList<String>();
	Path path=new Path();
	public boolean cc = true;
	public boolean clearCanvas = false;
	public DemoView(Context context) {
		super(context);
		paint.setAntiAlias(true);
 	    paint.setStrokeWidth(5f);
 	    paint.setColor(Color.BLACK);
 	    paint.setStyle(Paint.Style.STROKE);
 	    paint.setStrokeJoin(Paint.Join.ROUND);
 	    
		// TODO Auto-generated constructor stub
	}
	public DemoView(Context context,AttributeSet attrs) {
		super(context,attrs);
		paint.setAntiAlias(true);
 	    paint.setStrokeWidth(5f);
 	    paint.setColor(Color.BLACK);
 	    paint.setStyle(Paint.Style.STROKE);
		// TODO Auto-generated constructor stub
	    
	}
	public DemoView(Context context, AttributeSet attrs, int defStyle) {
	    super(context, attrs, defStyle);
	    paint.setAntiAlias(true);
 	    paint.setStrokeWidth(5f);
 	    paint.setColor(Color.BLACK);
 	    paint.setStyle(Paint.Style.STROKE);
 	    paint.setStrokeJoin(Paint.Join.ROUND);
	}
	@Override
	protected void onDraw(Canvas canvas) {
		 if(clearCanvas)
	        {  // Choose the colour you want to clear with.
	            //canvas.drawColor(Color.TRANSPARENT,android.graphics.PorterDuff.Mode.CLEAR);
	         
			 canvas.drawColor(Color.TRANSPARENT,Mode.CLEAR); 
			 path=new Path();
			 path.setLastPoint(lastx,lasty);
			 clearCanvas = false;
	        }
		 canvas.drawPath(path, paint);
	}
	
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		float eventX =(event.getX());
	    float eventY =(event.getY());
	    switch (event.getAction()) {
	        case MotionEvent.ACTION_DOWN:
	            // Set a new starting point
	            path.moveTo(eventX, eventY);
	            lastx=eventX;
	            lasty=eventY;
	            
	            
	            if(!pixel.contains(getpixel(eventX,eventY))){
	            	pixel.add(getpixel(eventX,eventY));
	            	System.out.println(getpixel(eventX,eventY));
	            }
	            break;
	        case MotionEvent.ACTION_MOVE:
	            // Connect the points
	            path.lineTo(eventX, eventY);
	            
	            if(!pixel.contains(getpixel(eventX,eventY))){
	            	pixel.add(getpixel(eventX,eventY));
	            	System.out.println(getpixel(eventX,eventY));
	            }
	            break;
	        case MotionEvent.ACTION_UP:
	            // Connect the points
	            
	            break;    
	        default:
	        	;
	        	
	            return false;
	    }
		invalidate();
		return true;
	}

}
