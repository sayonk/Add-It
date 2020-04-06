package com.example.add_it.ui.subject4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;

import com.example.add_it.R;

public class Subject4Fragment extends Fragment {

    private Subject4ViewModel subject4ViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        subject4ViewModel =
                ViewModelProviders.of(this).get(Subject4ViewModel.class);
        View root = inflater.inflate(R.layout.fragment_subject4, container, false);
        return root;
    }
}
