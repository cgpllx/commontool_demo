package com.kubeiwu.commontooldemo.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.kubeiwu.commontooldemo.R;

public class MyFragmentTabsactivity extends FragmentActivity {
	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		int layoutResID = getIntent().getIntExtra("layoutResID", R.layout.textmyfragmenttabs);
		setContentView(layoutResID);
	}
}
