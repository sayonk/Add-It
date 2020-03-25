package com.example.add_it.ui.subject2;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class Subject2ViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public Subject2ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Statistics Calculator");
    }

    public LiveData<String> getText() {
        return mText;
    }
}