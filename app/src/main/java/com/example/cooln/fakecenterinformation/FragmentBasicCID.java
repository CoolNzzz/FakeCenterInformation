package com.example.cooln.fakecenterinformation;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentBasicCID extends Fragment {
    public static FragmentBasicCID newInstance() {
        FragmentBasicCID fragmentBasicCID = new FragmentBasicCID();
        return fragmentBasicCID;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fr_hvac, container, false);
        return view;
    }
}

