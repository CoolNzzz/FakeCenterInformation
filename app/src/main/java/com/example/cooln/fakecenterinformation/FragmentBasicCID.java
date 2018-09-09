package com.example.cooln.fakecenterinformation;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.cooln.fakecenterinformation.databinding.FrHvacBinding;
import com.google.zxing.integration.android.IntentIntegrator;

public class FragmentBasicCID extends Fragment {

    private FrHvacBinding mFrHvacBinding;

    public static FragmentBasicCID newInstance() {
        FragmentBasicCID fragmentBasicCID = new FragmentBasicCID();
        return fragmentBasicCID;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {
        if (mFrHvacBinding == null) {
            mFrHvacBinding = DataBindingUtil.inflate(inflater, R.layout.fr_hvac, container, false);
        }

        return mFrHvacBinding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable final Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mFrHvacBinding.button.setOnClickListener(v -> {

            IntentIntegrator integrator = IntentIntegrator.forSupportFragment(this);
            integrator.setPrompt("Scan a barcode!!!");
            integrator.setCameraId(0);  // Use a specific camera of the device
            integrator.setBeepEnabled(false);
            integrator.setBarcodeImageEnabled(true);
            integrator.initiateScan();
        });
    }

    @Override
    public void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Log.d("CoolNzzz", "onActivityResult");
    }
}

