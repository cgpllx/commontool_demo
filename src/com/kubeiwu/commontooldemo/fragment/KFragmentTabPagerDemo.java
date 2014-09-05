package com.kubeiwu.commontooldemo.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TabHost;

import com.kubeiwu.commontool.fragment.KFragmentTabsPager;
import com.kubeiwu.commontooldemo.resource.MyDownloadFragment1;
import com.kubeiwu.commontooldemo.resource.MyDownloadFragment2;
import com.kubeiwu.commontooldemo.resource.MyDownloadFragment3;

public class KFragmentTabPagerDemo extends KFragmentTabsPager {

	@SuppressLint("InlinedApi")
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTabConfig(new TabConfig(android.R.color.holo_blue_bright, android.R.color.holo_blue_bright));
	}

	@Override
	protected void initTab(TabsPagerAdapter mTabsAdapter, TabHost mTabHost) {
		Button button1 = new Button(getActivity());
		button1.setText("标签1");
		Button button2 = new Button(getActivity());
		button2.setText("标签2");
		Button button3 = new Button(getActivity());
		button3.setText("标签3");
		mTabsAdapter.addTab(mTabHost.newTabSpec("名称").setIndicator(button1), MyDownloadFragment1.class, null);
		mTabsAdapter.addTab(mTabHost.newTabSpec("名称1").setIndicator(button2), MyDownloadFragment2.class, null);
		mTabsAdapter.addTab(mTabHost.newTabSpec("名称2").setIndicator(button3), MyDownloadFragment3.class, null);

	}

}
