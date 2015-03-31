package com.example.android.actionbarcompat.basic;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyFragment extends Fragment {

    public static final int WITH_SCROLLVIEW = 100;
    public static final int WITHOUT_SCROLLVIEW = 101;

    // just a quick workaroun, bad practice
    private static int currentType;

    public static MyFragment getInstance(final int type){
        currentType = type;
        return new MyFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(currentType == WITHOUT_SCROLLVIEW ? R.layout.without_scrollview : R.layout.with_scrollview, container, false);
    }

}
