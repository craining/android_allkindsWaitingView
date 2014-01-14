package com.zgy.waitingview.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.zgy.waitingview.R;

public class WaitingView extends LinearLayout {

	private Context mContext;
	

	public WaitingView(Context context, AttributeSet attrs) {
		super(context, attrs);
		init(context);
	}

	public WaitingView(Context context) {
		super(context);
		init(context);
	}

	/**
	 * ≥ı ºªØ
	 * 
	 * @author: zhuanggy
	 */
	private void init(Context context) {
		if (mContext == null) {
			mContext = context;
//			LayoutInflater inflater = LayoutInflater.from(mContext);
//			ViewGroup main = (ViewGroup) inflater.inflate(R.layout.imageview_online, null);
//
//			this.addView(main);
		}
	}
	
	private void show(WaitingViewConfig config) {
		 this.removeAllViews();
		 
		 
		 
		 
	}

}
