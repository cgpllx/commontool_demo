package com.kubeiwu.commontooldemo.fragment;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

import com.kubeiwu.commontool.db.KCommonToolDb;
import com.kubeiwu.commontool.db.KCommonToolDb.DaoConfig;
import com.kubeiwu.commontooldemo.R;
import com.kubeiwu.commontooldemo.pojo.TabText;

public class KCommonToolDbText extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.tooldb, container, false);
		return view;
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		view.findViewById(R.id.start).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				KCommonToolDb commonToolDb = KCommonToolDb.create(new DaoConfig().setContext(getActivity()));
				List<TabText> entitys = new ArrayList<>();
				for (int i = 1; i < 50; i++) {
					entitys.add(new TabText(i, 18, "张三"));
				}
//				System.out.println(entitys.size());
//				commonToolDb.insert(new TabText(100, 18, "张三"));
				commonToolDb.insertOrReplaceAll(entitys);
				List<TabText>  lists=commonToolDb.findAll(TabText.class);
				System.out.println("有多少个"+lists.size());
				Log.e("有多少个", lists.size()+"");
				for(TabText tabText:commonToolDb.findAll(TabText.class)){
					System.out.println(tabText.getName());
				}
			}
		});
	}

}
