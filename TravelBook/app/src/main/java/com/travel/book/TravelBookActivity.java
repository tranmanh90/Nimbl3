package com.travel.book;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;

public class TravelBookActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_travel_book);
    }
}
