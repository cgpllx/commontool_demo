package com.kubeiwu.commontooldemo.resource;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.kubeiwu.commontooldemo.R;

public class MyDownloadFragment1 extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
				 TextView textView=new TextView(getActivity());
				 textView.setText("我是111111111111111111111");
//		View view = inflater.inflate(R.layout.aactivity_main, null, false);
//		ViewPager viewPager=new ViewPager(getActivity());
//		viewPager.setAdapter(new ScrollViewPageAdapter(getChildFragmentManager()));
		return textView;
	}

	public class ScrollViewPageAdapter extends FragmentPagerAdapter {

		public ScrollViewPageAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public int getCount() {
			return 400;
		}

		@Override
		public Fragment getItem(int position) {
			//			return ArrayListFragment.newInstance(lists.get(position).getPic());
			return new ArrayListFragment();
		}
	}

	public class ArrayListFragment extends Fragment {
		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

			FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
			layoutParams.gravity = Gravity.CENTER_HORIZONTAL;
			FrameLayout frameLayout = new FrameLayout(getActivity());
			frameLayout.setLayoutParams(layoutParams);

			ImageView imageView = new ImageView(getActivity());
			imageView.setScaleType(ImageView.ScaleType.FIT_XY);
			imageView.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
			imageView.setImageResource(R.drawable.pic_main_gallery_default);
			//			Assist.imageLoader.displayImage(lists.get(mNum).getPic(), imageView, Assist.options);
			//			imageView.setOnClickListener(new OnClickListener() {
			//				@Override
			//				public void onClick(View v) {
			//					Util.startPalyActivity(mContext, lists.get(mNum));
			//				}
			//			});
//			frameLayout.addView(imageView);
			//			LinearLayout banner = new LinearLayout(getActivity());
			//			banner.setBackgroundResource(R.drawable.pic_main_gallery_default);
			//			banner.setGravity(Gravity.RIGHT | Gravity.BOTTOM);
			//			banner.setPadding(0, 0, 30, 15);

			//			frameLayout.addView(banner);
			return imageView;
		}
	}
}
