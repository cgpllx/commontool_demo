package com.kubeiwu.commontooldemo;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;

import com.kubeiwu.commontooldemo.fragment.ControllerFragment;
//https://github.com/cgpllx/commontool_demo.git
public class MainActivity extends FragmentActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ControllerFragment fragment = new ControllerFragment();
		FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
		transaction.replace(R.id.content_view, fragment, fragment.getClass().getName());
		transaction.addToBackStack(null);
		transaction.commitAllowingStateLoss();
	}


}
