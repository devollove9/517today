package com.us517.a517today.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;
    private final MutableLiveData<String> mText2;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
        mText2 = new MutableLiveData<>();
        mText2.setValue("This is home fragment2");
    }

    public LiveData<String> getText() {
        return mText;
    }

    public LiveData<String> getText2() {
        return mText2;
    }
}