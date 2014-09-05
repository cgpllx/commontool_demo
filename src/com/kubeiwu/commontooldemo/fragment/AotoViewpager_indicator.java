//2014-8-6
package com.kubeiwu.commontooldemo.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

import com.kubeiwu.commontool.view.aotuviewpager.AutoScrollViewPager;
import com.kubeiwu.commontool.view.viewpageindicator.CirclePageIndicator;
import com.kubeiwu.commontooldemo.R;

/**
 * 自动轮播+指示器
 * @author  cgpllx1@qq.com (www.kubeiwu.com)
 * @date    2014-8-6
 */
public class AotoViewpager_indicator extends Fragment {
	CirclePageIndicator mIndicator;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.aotoviewpagerfragment_pager, container, false);
		AutoScrollViewPager viewPager = (AutoScrollViewPager) view.findViewById(R.id.pager);//viewPager.startAutoScroll();
		viewPager.setAdapter(new MyAdapter(getChildFragmentManager()));
		viewPager.startAutoScroll();

		mIndicator = (CirclePageIndicator) view.findViewById(R.id.indicator);
		//		mIndicator.setBackgroundColor(Color.TRANSPARENT);
		//		mIndicator.setFillColor(Color.WHITE);
		//		mIndicator.setPageColor(0x64FFFFFF);
		//		mIndicator.setStrokeColor(0xffFF0000);
		//		mIndicator.setRadius(5f);
		//		mIndicator.setStrokeWidth(0f);
		//		mIndicator.setInterspace(20f);
		//		mIndicator.set
		mIndicator.setViewPager(viewPager);
		mIndicator.setSnap(true);
		return view;
	}

	public class MyAdapter extends FragmentPagerAdapter {

		public MyAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public int getCount() {
			return 5;
		}

		@Override
		public Fragment getItem(int position) {
			return ArrayListFragment.newInstance();
		}
	}

	public static class ArrayListFragment extends Fragment {
		static ArrayListFragment newInstance() {
			ArrayListFragment f = new ArrayListFragment();
			return f;
		}

		@Override
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
			ImageView imageView = new ImageView(inflater.getContext());
			imageView.setImageResource(R.drawable.videobj);
			imageView.setScaleType(ScaleType.FIT_XY);
			return imageView;
		}
	}
}
