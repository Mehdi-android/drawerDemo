package com.example.drawerdemo;


import android.annotation.TargetApi;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Switch;

import com.example.drawerdemo.fragment.MainFragment;
import com.example.drawerdemo.fragment.SearchFlightFragment;
import com.example.drawerdemo.fragment.SlidingMenuFragment;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;


public class MainActivity extends BaseActivity implements OnClickListener {

    public MainActivity() {
        super(R.string.app_name);
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    public void onCreate(Bundle savedInstanceState) {
        getActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.menubutton).setOnClickListener(this);
        getSlidingMenu().setMode(SlidingMenu.LEFT);
        getSlidingMenu().setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);

		/*getSlidingMenu().setMode(SlidingMenu.LEFT);
        getSlidingMenu().setTouchModeAbove(SlidingMenu.TOUCHMODE_NONE);*/

//        drawermenuFunction();

        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new MainFragment()).commit();

    }



    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.menubutton:
                showMenu();
                Log.e("SHOW MENU","CLICK OK");
                break;
        }
    }

    private void drawermenuFunction()
    {
        /*getSlidingMenu().setOnOpenListener(new View.OnOpenListener() {
            @Override
            public void onOpen() {
                SlidingMenuFragment.viewSelectedPosition();

            }
        });*/

        getSlidingMenu().setOnOpenedListener(new SlidingMenu.OnOpenedListener() {
            @Override
            public void onOpened() {

            }
        });
    }
}
