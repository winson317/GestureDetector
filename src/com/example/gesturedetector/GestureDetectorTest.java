package com.example.gesturedetector;

import android.app.Activity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.widget.Toast;

/*
 * 使用android的手势检测只需两个步骤：
 * 1、创建一个GestureDetector 对象，创建该对象时必须实现一个GestureDetector.OnGestureListener监听器实例.
 * 2、为应用程序的Activity的TouchEvent事件绑定监听器，在事件处理中指定把Activity上的TouchEvent事件交给GestureDetector处理.
 */

public class GestureDetectorTest extends Activity implements OnGestureListener{
	
	GestureDetector detector;  //定义手势检测器实例

    @SuppressWarnings("deprecation")
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        detector = new GestureDetector(this);  //创建手势检测器
      
    }
    
    //将该Activity上的触碰事件交给GestureDetector处理
    @Override
    public boolean onTouchEvent(MotionEvent event) {
    	// TODO Auto-generated method stub
    	return detector.onTouchEvent(event);
    }

	@Override
	public boolean onDown(MotionEvent arg0) {
		// TODO Auto-generated method stub
		Toast.makeText(this, "onDown", Toast.LENGTH_LONG).show();
		return false;
	}

	@Override
	public boolean onFling(MotionEvent arg0, MotionEvent arg1, float velocityX, float velocityY) {
		// TODO Auto-generated method stub
		Toast.makeText(this, "onFling", Toast.LENGTH_LONG).show();
		return false;
	}

	@Override
	public void onLongPress(MotionEvent arg0) {
		// TODO Auto-generated method stub
		Toast.makeText(this, "onLongPress", Toast.LENGTH_LONG).show();
	}

	@Override
	public boolean onScroll(MotionEvent arg0, MotionEvent arg1, float distanceX, float distanceY) {
		// TODO Auto-generated method stub
		Toast.makeText(this, "onScroll", Toast.LENGTH_LONG).show();
		return false;
	}

	@Override
	public void onShowPress(MotionEvent arg0) {
		// TODO Auto-generated method stub
		Toast.makeText(this, "onShowPress", Toast.LENGTH_LONG).show();
	}

	@Override
	public boolean onSingleTapUp(MotionEvent arg0) {
		// TODO Auto-generated method stub
		Toast.makeText(this, "onSingleTapUp", Toast.LENGTH_LONG).show();
		return false;
	}
}
