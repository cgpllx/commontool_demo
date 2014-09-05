package com.kubeiwu.commontooldemo.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.widget.Button;
import android.widget.TextView;

import com.kubeiwu.commontool.fragment.KFragmentTab;
import com.kubeiwu.commontooldemo.resource.MyDownloadFragment1;
import com.kubeiwu.commontooldemo.resource.MyDownloadFragment2;
import com.kubeiwu.commontooldemo.resource.MyDownloadFragment3;

public class KFragmentTabDemo extends KFragmentTab{
	@SuppressLint("InlinedApi")
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTabConfig(new TabConfig(android.R.color.holo_blue_bright, android.R.color.holo_blue_bright));
	}
	@Override
	public void initTab(FragmentTabHost mFragmentTabHost) {
		TextView button1 = new Button(getActivity());
		button1.setText("标签1");
		TextView button2 = new Button(getActivity());
		button2.setText("标签2");
		TextView button3 = new Button(getActivity());
		button3.setText("标签3");
		mFragmentTabHost.addTab(mFragmentTabHost.newTabSpec("simple1").setIndicator(button1), MyDownloadFragment1.class, null);
		mFragmentTabHost.addTab(mFragmentTabHost.newTabSpec("simple2").setIndicator(button2), MyDownloadFragment2.class, null);
		mFragmentTabHost.addTab(mFragmentTabHost.newTabSpec("simple3").setIndicator(button3), MyDownloadFragment3.class, null);
	}
}
