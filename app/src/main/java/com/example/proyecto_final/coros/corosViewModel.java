package com.example.proyecto_final.ui.coros;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class corosViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public corosViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Coros");
    }

    public LiveData<String> getText() {
        return mText;
    }
}