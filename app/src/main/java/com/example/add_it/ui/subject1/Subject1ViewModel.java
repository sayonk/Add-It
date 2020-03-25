package com.example.add_it.ui.subject1;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class Subject1ViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public Subject1ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Math Calculator");
    }

    public LiveData<String> getText() {
        return mText;
    }
}