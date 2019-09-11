package com.example.a37_lifecycledemo.ui.main;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

//import com.example.a37_lifecycledemo.DemoObserver;
import com.example.a37_lifecycledemo.DemoOwner;
import com.example.a37_lifecycledemo.R;

public class MainFragment extends Fragment {

    private MainViewModel mViewModel;
    private DemoOwner demoOwner;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        // TODO: Use the ViewModel
        demoOwner = new DemoOwner();
        demoOwner.startOwner();
        demoOwner.stopOwner();
        //getLifecycle().addObserver(new DemoObserver());
    }

}
