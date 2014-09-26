package com.kubeiwu.commontooldemo.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.kubeiwu.commontooldemo.R;

public class ControllerFragment extends ListFragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return super.onCreateView(inflater, container, savedInstanceState);
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		Myadapter adapter = new Myadapter(getActivity(), android.R.layout.simple_list_item_1);
		adapter.addAll(data);
		setListAdapter(adapter);

	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
		Fragment fragment = null;
		switch (position) {
		case 0:
			fragment = new KFragmentTabDemo();
			break;
		case 1:
			fragment = new KFragmentTabPagerDemo();
			break;
		case 2:
			fragment = new AotoViewpager_indicator();
			break;
		case 3:
			fragment = new KlistviewFragment();
			break;
		case 4:
			fragment = new KCommonToolDbText();
			break;
		}
		transaction.replace(R.id.content_view, fragment, fragment.getClass().getName());
		transaction.addToBackStack(null);
		transaction.commitAllowingStateLoss();
	}

	class Myadapter extends ArrayAdapter<String> {

		public Myadapter(Context context, int textViewResourceId) {
			super(context, textViewResourceId);
		}

	}

	String[] data = { "Tab", "TabPager", "aotoViewpager","KlistviewFragment" ,"KCommonToolDb"};
}
