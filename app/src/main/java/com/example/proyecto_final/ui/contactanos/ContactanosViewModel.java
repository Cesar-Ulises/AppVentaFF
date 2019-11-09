package com.example.proyecto_final.ui.contactanos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ContactanosViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ContactanosViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Contactanos");
    }

    public LiveData<String> getText() {
        return mText;
    }
}