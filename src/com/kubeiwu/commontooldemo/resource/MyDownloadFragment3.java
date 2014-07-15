package com.kubeiwu.commontooldemo.resource;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyDownloadFragment3 extends Fragment{
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		 TextView textView=new TextView(getActivity());
		 textView.setText("我是333333333333333 3");
		return textView;
	}
}
