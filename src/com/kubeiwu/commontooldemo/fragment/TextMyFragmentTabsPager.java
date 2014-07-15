package com.kubeiwu.commontooldemo.fragment;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.TabWidget;

import com.kubeiwu.commontool.adapter.TabsPagerAdapter;
import com.kubeiwu.commontool.core.SimpleHandleTabsPager;
import com.kubeiwu.commontool.fragment.BaseFragmentTabsPager;
import com.kubeiwu.commontooldemo.resource.MyDownloadFragment1;
import com.kubeiwu.commontooldemo.resource.MyDownloadFragment2;
import com.kubeiwu.commontooldemo.resource.MyDownloadFragment3;

public class TextMyFragmentTabsPager extends BaseFragmentTabsPager {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		//initTabs(handleTabsPager);
		initTabs(handleTabsPager, Gravity.TOP);
		return super.onCreateView(inflater, container, savedInstanceState);
	}

	SimpleHandleTabsPager handleTabsPager = new SimpleHandleTabsPager() {
		@Override
		public void addTab(TabsPagerAdapter mTabsAdapter, TabHost mTabHost) {
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

		@Override
		public void setTabWidgetBackground(TabWidget widgetview) {
			widgetview.setBackgroundResource(android.R.color.black);
		}

		@Override
		public void setTabWidgetChildViewBackground(View widgetchildview) {
			widgetchildview.setBackgroundResource(android.R.color.holo_red_light);
		}
	};
}
