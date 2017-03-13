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
	public String getpixel(float x,float y){
        int pointx=0;
        int pointy=0;
        if(x<50){
          pointx=1;
        }else if(x<100){
          pointx=2;
        }else if(x<150){
          pointx=3;
        }else if(x<200){
          pointx=4;
        }else if(x<250){
          pointx=5;
        }else if(x<300){
          pointx=6;
        }else if(x<355){
          pointx=7;
        }else if(x<400){
          pointx=8;
        }else if(x<450){
          pointx=9;
        }else{
          pointx=10;
        }

        if(y<50){
          pointy=0;
        }else if(y<100){
          pointy=1;
        }else if(y<150){
          pointy=2;
        }else if(y<200){
          pointy=3;
        }else if(y<250){
          pointy=4;
        }else if(y<300){
          pointy=5;
        }else if(y<350){
          pointy=6;
        }else if(y<400){
          pointy=7;
        }else if(y<450){
          pointy=8;
        }else{
          pointy=9; 
        }
        
        if(pointx==10){return ""+((pointx*pointy)+10);}
        else if(pointy==0){return ""+pointx;}
        else{return pointy+""+pointx;}
      }
	public void hapus(){
		
		clearCanvas=true;
		
		//invalidate();
	}
	public void putuskan(){
		Handler h = new Handler(Looper.getMainLooper());
		h.post(new Runnable() {
		  public void run() {
			  if(pixel.indexOf("64")==-1){
		          //if 64 false
		          if(pixel.indexOf("43")==-1){
		          //if 43 false
		            if(pixel.indexOf("38")==-1){
		              //if 38 false
		                if(pixel.indexOf("48")==-1){
		                //if 48 false
		                    if(pixel.indexOf("17")==-1){
		                    //if 17 false
		                        if(pixel.indexOf("47")==-1){
		                        //if 47 false
		                        alert("I");
		                        }else{
		                          //if 47 true
		                          alert("9");
		                        }
		                    }else{
		                      //if 17 true
		                      alert("I");
		                    }
		                }else{
		                  //if 48 true
		                  alert("5");
		                }
		            }else{
		              //if 38 true
		                if(pixel.indexOf("17")==-1){
		                  //if 17 false
		                  if(pixel.indexOf("47")==-1){
		                  //if 47 false
		                  alert("5");
		                  }else{
		                    //if 47 true
		                    if(pixel.indexOf("48")==-1){
		                    //if 48 false
		                    alert("9");
		                    }else{
		                      //if 48 true
		                      alert("7");
		                    }
		                  }
		                }else{
		                  //if 17 true
		                  alert("E");
		                }
		            }
		          }else{
		            //if 43 true
		            if(pixel.indexOf("47")==-1){
		            //if 47 false
		            alert("E");
		            }else{
		              //if 47 true
		              if(pixel.indexOf("48")==-1){
		              //if 48 false
		              alert("U");
		              }else{
		                //if 48 true
		                alert("O");
		              }
		            }
		          }
		        }else{
		          //if 64 true
		          if(pixel.indexOf("43")==-1){
		          //if 43 false
		            if(pixel.indexOf("38")==-1){
		                //if 38 false
		                 if(pixel.indexOf("48")==-1){
		                  //if 48 false
		                  alert("A");
		                  }else{
		                  //if 48 true
		                    if(pixel.indexOf("47")==-1){
		                    //if 47 false
		                    alert("U");
		                    }else{
		                    //if 47 true
		                    alert("E");
		                    }
		                  }
		              }else{
		                //if 38 true
		                  if(pixel.indexOf("47")==-1){
		                  //if 47 false
		                  alert("U");
		                  }else{
		                  //if 47 true
		                  alert("8");
		                  }
		                
		              }
		          }else{
		            //if 43 true
		            if(pixel.indexOf("17")==-1){
		              //if 17 false
		              alert("O");
		            }else{
		              //if 17 true
		              alert("E");
		            }
		          }
		        }
			  //Toast.makeText(getContext(), "O",Toast.LENGTH_LONG).show();
			  pixel = new ArrayList<String>();
			  
		  }
		});
		hapus();
		cc=true;
	}
	public void alert(String alert){
		Toast.makeText(getContext(), alert,Toast.LENGTH_SHORT).show();
	}
	public void timer() {
		if(cc){
		th = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(3000);
					putuskan();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		th.start();
		cc=false;
		}
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
	            timer();
	            break;    
	        default:
	        	;
	        	
	            return false;
	    }
		invalidate();
		return true;
	}

}
