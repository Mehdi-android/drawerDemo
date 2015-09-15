package com.example.drawerdemo.fragment;

import android.annotation.TargetApi;
import android.support.v4.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.drawerdemo.R;

/**
 * Created by user22 on 9/9/15.
 */
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class SearchFlightTwoWay extends Fragment {
View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.searchflight_returning, null);
        return view;
    }
}
