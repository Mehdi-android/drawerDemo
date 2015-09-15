package com.example.drawerdemo.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.drawerdemo.MainActivity;
import com.example.drawerdemo.R;
import com.example.drawerdemo.view.Utils;

public class SlidingMenuFragment extends Fragment implements OnClickListener {

	public View mRoot;
	
	private LinearLayout mMenuLayout;
	public static int pos_x = 0, pos_y = 0;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		mRoot = inflater.inflate(R.layout.list, null);
		mMenuLayout = (LinearLayout) mRoot.findViewById(R.id.menuLayout);

		return mRoot;
	}

	@Override
	public void onClick(View view) {
		for (int i = 1; i < mMenuLayout.getChildCount(); i++) {
			((TextView) mMenuLayout.getChildAt(i)).setBackgroundResource(R.drawable.menuitem_normal);
			((TextView) mMenuLayout.getChildAt(i)).setCompoundDrawablesWithIntrinsicBounds(R.drawable.menuitem_arrow_normal, 0, 0, 0);
		}
		((TextView) view).setBackgroundResource(R.drawable.menuitem_active);
		((TextView) view).setCompoundDrawablesWithIntrinsicBounds(R.drawable.menuitem_arrow_active, 0, 0, 0);
		switch (view.getId()) {
		case R.id.menuGenderTimer:
			//getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new MainFragment()).commit();
			break;
		case R.id.menuGenderTypes:
			break;
		case R.id.menuResults:
			break;

		}
		((MainActivity) getActivity()).getSlidingMenu().toggle();
	}
}
