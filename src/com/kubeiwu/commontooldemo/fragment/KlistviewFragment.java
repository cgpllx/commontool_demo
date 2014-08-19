//2014-8-6
package com.kubeiwu.commontooldemo.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.kubeiwu.commontool.view.pulltorefresh.listview.KListView;
import com.kubeiwu.commontool.view.pulltorefresh.listview.KListView.IKListViewListener;
import com.kubeiwu.commontooldemo.R;

//Administrator
public class KlistviewFragment extends Fragment {
	KListView kListView;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.klistview, container, false);
		
		kListView = (KListView) view.findViewById(R.id.listview);
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

			}
		});
		kListView.setHeaderHintNormal("测试测试测试");
		kListView.setArrowPicResources(R.drawable.xlistview_arrow);
		kListView.setHeaderHeaght(100);
		kListView.setFooterHeaght(200);
		kListView.setAdapter(new BaseAdapter() {

			@Override
			public View getView(int position, View convertView, ViewGroup parent) {
				TextView textView = new TextView(getActivity());
				textView.setText("demo" + position);
				textView.setHeight(40);
				return textView;
			}

			@Override
			public long getItemId(int position) {
				return 0;
			}

			@Override
			public Object getItem(int position) {
				return null;
			}

			@Override
			public int getCount() {
				return 20;
			}
		});
		return view;
	}
}
