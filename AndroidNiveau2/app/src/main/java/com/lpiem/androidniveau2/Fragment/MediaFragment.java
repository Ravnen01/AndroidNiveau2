package com.lpiem.androidniveau2.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lpiem.androidniveau2.R;

/**
 * Created by iem2 on 09/11/15.
 */
public class MediaFragment extends Fragment {
    private String type;


    public MediaFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.media_fragment, container, false);

        return view;
    }
}
