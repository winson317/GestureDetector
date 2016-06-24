package com.example.gesturedetector;

import android.app.Activity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.widget.Toast;

/*
 * ʹ��android�����Ƽ��ֻ���������裺
 * 1������һ��GestureDetector ���󣬴����ö���ʱ����ʵ��һ��GestureDetector.OnGestureListener������ʵ��.
 * 2��ΪӦ�ó����Activity��TouchEvent�¼��󶨼����������¼�������ָ����Activity�ϵ�TouchEvent�¼�����GestureDetector����.
 */

public class GestureDetectorTest extends Activity implements OnGestureListener{
	
	GestureDetector detector;  //�������Ƽ����ʵ��

    @SuppressWarnings("deprecation")
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        detector = new GestureDetector(this);  //�������Ƽ����
      
    }
    
    //����Activity�ϵĴ����¼�����GestureDetector����
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
