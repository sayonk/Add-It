package com.example.add_it.ui.subject3;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class Subject3ViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public Subject3ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Physics Calculator");
    }

    public LiveData<String> getText() {
        return mText;
    }
}