package com.kubeiwu.commontooldemo.fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TabWidget;

import com.kubeiwu.commontool.core.SimpleHandleTabs;
import com.kubeiwu.commontool.fragment.BaseFragmentTabs;
import com.kubeiwu.commontooldemo.resource.MyDownloadFragment1;
import com.kubeiwu.commontooldemo.resource.MyDownloadFragment2;
import com.kubeiwu.commontooldemo.resource.MyDownloadFragment3;

public class TextMyFragmentTabs extends BaseFragmentTabs {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		initTabs(mSimpleHandleTabs, Gravity.TOP);
		return super.onCreateView(inflater, container, savedInstanceState);
	}

	SimpleHandleTabs mSimpleHandleTabs = new SimpleHandleTabs() {
		@Override
		public void addTab(FragmentTabHost mFragmentTabHost) {
			Button button1 = new Button(getActivity());
			button1.setText("标签1");
			Button button2 = new Button(getActivity());
			button2.setText("标签2");
			Button button3 = new Button(getActivity());
			button3.setText("标签3");
			mFragmentTabHost.addTab(mFragmentTabHost.newTabSpec("simple1").setIndicator(button1), MyDownloadFragment1.class, null);
			mFragmentTabHost.addTab(mFragmentTabHost.newTabSpec("simple2").setIndicator(button2), MyDownloadFragment2.class, null);
			mFragmentTabHost.addTab(mFragmentTabHost.newTabSpec("simple3").setIndicator(button3), TextMyFragmentTabsPager.class, null);
		}

		//根据需求覆写
		@Override
		public void setTabWidgetBackground(TabWidget widgetview) {
			widgetview.setBackgroundResource(android.R.color.holo_blue_light);
		}

		//根据需求覆写
		@Override
		public void setTabWidgetChildViewBackground(View widgetchildview) {
			widgetchildview.setBackgroundResource(android.R.color.holo_red_light);
		}
	};
}
