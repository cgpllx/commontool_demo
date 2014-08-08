package com.kubeiwu.commontooldemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import com.kubeiwu.commontooldemo.activity.MyFragmentTabsactivity;
import com.kubeiwu.commontooldemo.fragment.AotoViewpager_indicator;

public class MainActivity extends FragmentActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void tabs(View v) {
		Intent intent = new Intent(this, MyFragmentTabsactivity.class);
		intent.putExtra("layoutResID", R.layout.textmyfragmenttabs);
		startActivity(intent);
	}

	public void tabspager(View v) {
		Intent intent = new Intent(this, MyFragmentTabsactivity.class);
		intent.putExtra("layoutResID", R.layout.textmyfragmenttabspager);
		startActivity(intent);
	}
	public void aotoViewpager(View v) {
		Intent intent = new Intent(this, MyFragmentTabsactivity.class);
		intent.putExtra("layoutResID", R.layout.textaotoviewpagerfragment_pager);
		startActivity(intent);
	}
}
