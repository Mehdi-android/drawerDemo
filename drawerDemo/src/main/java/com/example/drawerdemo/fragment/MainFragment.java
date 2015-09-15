package com.example.drawerdemo.fragment;

import android.annotation.TargetApi;

import android.support.v4.app.FragmentTransaction;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.drawerdemo.R;
import com.nusatrip.adapter.CustomList;

import static com.example.drawerdemo.R.id.content_frame;


public class MainFragment extends Fragment {
View mRoot;
    ListView list,recentsearchlist;
    String[] web = {
            "FLIGHTS",
            "HOTELS",
            "MY BOOKINGS",

    } ;

    Integer[] imageId = {
            R.drawable.menu_icon_1,
            R.drawable.menu_icon_2,
            R.drawable.menu_icon_3,



    };



    @Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        mRoot = inflater.inflate(R.layout.fragment_main, null);
        CustomList adapter = new
                CustomList(getActivity(), web, imageId);
        list=(ListView)mRoot.findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @TargetApi(Build.VERSION_CODES.HONEYCOMB)
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
               if(position==0){
                   SearchFlightFragment mLatestFragment = new SearchFlightFragment();

                   // mFeaturedFragment.setArguments(bundle);

//                   FragmentTransaction t = getActivity().getFragmentManager().beginTransaction();
//                   SearchFlightFragment mFrag = new SearchFlightFragment();
//                   t.replace(R.id.content_frame,
//                           mLatestFragment);
//                   t.commit();
//                   getActivity().getFragmentManager().beginTransaction().replace(R.id.content_frame, new SearchFlightFragment()).commit();
                        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.content_frame,new SearchFlightFragment()).commit();
               }

            }
        });
//        recentsearchlist = (ListView)mRoot.findViewById(R.id.recentsearchlist);
        return mRoot;

	}


}
