package com.example.proyecto_final.ui.alabanzas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AlabanzasViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AlabanzasViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Alabanzas");
    }

    public LiveData<String> getText() {
        return mText;
    }
}