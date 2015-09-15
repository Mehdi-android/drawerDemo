package com.example.drawerdemo.fragment;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTabHost;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.Toast;

import com.example.drawerdemo.R;

/**
 * Created by user22 on 8/9/15.
 */
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class SearchFlightFragment extends Fragment implements View.OnClickListener {
    View view;
    private FragmentTabHost mTabHost;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//       n view;
        mTabHost = new FragmentTabHost(getActivity());
        mTabHost.setup(getActivity(), getChildFragmentManager(), R.layout.searchflight_tabhost);

        for(int i=0;i<mTabHost.getTabWidget().getChildCount();i++)
        {
            if (i == 0) mTabHost.getTabWidget().getChildAt(i).setBackgroundColor(Color.parseColor("#000B25"));

            else mTabHost.getTabWidget().getChildAt(i).setBackgroundColor(Color.parseColor("#000B25"));
        }

        Bundle arg1 = new Bundle();
        arg1.putInt("Arg for Frag1", 1);
        mTabHost.addTab(mTabHost.newTabSpec("Tab1").setIndicator("ONE WAY"),
                SearchFlightOneWay.class, arg1);

        Bundle arg2 = new Bundle();
        arg2.putInt("Arg for Frag2", 2);
        mTabHost.addTab(mTabHost.newTabSpec("Tab2").setIndicator("ROUND TRIP"),
                SearchFlightTwoWay.class, arg2);

        return mTabHost;
    }



    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imagebutton:
                Toast.makeText(getActivity(), "Clicked", Toast.LENGTH_LONG).show();
                Log.e("SHOW MENU", "CLICK OK");
                break;
        }
    }
}
