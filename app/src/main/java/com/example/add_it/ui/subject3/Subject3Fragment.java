package com.example.add_it.ui.subject3;

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

public class Subject3Fragment extends Fragment {

    private Subject3ViewModel subject3ViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        subject3ViewModel =
                ViewModelProviders.of(this).get(Subject3ViewModel.class);
        View root = inflater.inflate(R.layout.fragment_subject3, container, false);
        final TextView textView = root.findViewById(R.id.text_subject3);
        subject3ViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
