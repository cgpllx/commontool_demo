//2014-8-6
package com.kubeiwu.commontooldemo.fragment;

import java.util.ArrayList;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.kubeiwu.commontool.view.pulltorefresh.listview.KListView;
import com.kubeiwu.commontool.view.pulltorefresh.listview.KListView.IKListViewListener;
import com.kubeiwu.commontool.view.pulltorefresh.listview.KListView.KConfig;

//Administrator
public class KlistviewFragment extends Fragment {
 
	private KListView	kListView;
 

	@SuppressLint("NewApi")
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		kListView = new KListView(inflater.getContext(), KConfig.getSimpleInstance().setHeader_hint_ready("康佳康佳"));// 代码写
		// View view = inflater.inflate(R.layout.klistview, container,false);//xml
		// kListView = (KListView) view.findViewById(R.id.listview);
		kListView.setPullRefreshEnable(true);
		kListView.setPullLoadEnable(true);
		kListView.setKListViewListener(new IKListViewListener() {
			@Override
			public void onRefresh() {
				new Handler().postDelayed(new Runnable() {
					@Override
					public void run() {
						kListView.stopLoadMore();
						kListView.stopRefresh();
					}
				}, 1000 * 5);
			}

			@Override
			public void onLoadMore() {
				new Handler().postDelayed(new Runnable() {
					@Override
					public void run() {
 
						kListView.stopLoadMore();   
 
						kListView.stopLoadMore();
 
						kListView.stopRefresh();
					}
				}, 1000 * 5);
			}
		});

		// kListView.setHeaderHintNormal("测试测试测试");
		// kListView.setArrowPicResources(R.drawable.xlistview_arrow);
		// kListView.setHeaderHeaght(100);
		// kListView.setFooterHeaght(50);
		ArrayList<String> lists = new ArrayList<String>();
		for (int i = 0; i < 30; i++) {
			lists.add("Klistview" + i);
		}
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1);
		adapter.addAll(lists);
		kListView.setAdapter(adapter);
		return kListView;
	}
}
