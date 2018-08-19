package com.example.cooln.fakecenterinformation;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentAmbientLightCID extends Fragment {

    //private View mC
            
    public static FragmentAmbientLightCID newInstance() {
        FragmentAmbientLightCID fragmentAmbientLightCID = new FragmentAmbientLightCID();
        return fragmentAmbientLightCID;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fr_ambientlight, container, false);
        return view;
    }
}
