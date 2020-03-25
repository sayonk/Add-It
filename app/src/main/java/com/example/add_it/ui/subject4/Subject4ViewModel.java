package com.example.add_it.ui.subject4;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class Subject4ViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public Subject4ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Chemistry Calculator");
    }

    public LiveData<String> getText() {
        return mText;
    }
}