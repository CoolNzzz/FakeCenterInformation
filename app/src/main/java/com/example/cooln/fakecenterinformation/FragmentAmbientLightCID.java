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
import com.example.cooln.fakecenterinformation.databinding.FrAmbientlightBinding;
import com.google.zxing.integration.android.IntentIntegrator;

public class FragmentAmbientLightCID extends Fragment {

    private FrAmbientlightBinding mFrAmbientlightBinding;

    public static FragmentAmbientLightCID newInstance() {
        FragmentAmbientLightCID fragmentAmbientLightCID = new FragmentAmbientLightCID();
        return fragmentAmbientLightCID;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable final ViewGroup container,
            @Nullable final Bundle savedInstanceState) {
        if (mFrAmbientlightBinding == null) {
            mFrAmbientlightBinding = DataBindingUtil.inflate(inflater, R.layout.fr_ambientlight, container, false);
        }

        return mFrAmbientlightBinding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable final Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mFrAmbientlightBinding.ambientThumb.setOnClickListener(v -> {
            //IntentIntegrator.forSupportFragment(this).initiateScan(); // `this` is the current Fragment

            IntentIntegrator integrator = IntentIntegrator.forSupportFragment(this);
            integrator.setPrompt("Please set the barcode inside the square.");
            integrator.setBeepEnabled(false);
            integrator.setBarcodeImageEnabled(true);
            integrator.initiateScan();
        });

        //mFrAmbientlightBinding.tlColorFirst
    }

    @Override
    public void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Log.d("CoolNzzz", "AmbientLightCid, onActivityResylt");
    }
}
