package com.kubeiwu.commontooldemo.resource;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyDownloadFragment2 extends Fragment{
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		 TextView textView=new TextView(getActivity());
		 textView.setText("我是2222222222222222222222");
		return textView;
	}
}
