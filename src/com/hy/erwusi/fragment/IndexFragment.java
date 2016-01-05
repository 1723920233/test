package com.hy.erwusi.fragment;

import java.util.ArrayList;
import java.util.List;

import com.hy.erwusi.R;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class IndexFragment extends Fragment{
	ViewPager viewpager;
	List<View> list;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view=inflater.inflate(R.layout.index_layout, null);
		invite(view,inflater);
		return view;
	}
	/*
	 * ≥ı ºªØ
	 */
	private void invite(View view,LayoutInflater inflater) {
		viewpager=(ViewPager) view.findViewById(R.id.index_viewpager);
		list=new ArrayList<View>();
		list.add(inflater.inflate(R.drawable.ic_launcher, null));
		list.add(inflater.inflate(R.drawable.text, null));
		
	}

}
