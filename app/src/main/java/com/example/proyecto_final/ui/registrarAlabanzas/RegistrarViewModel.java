package com.example.proyecto_final.ui.registrarAlabanzas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RegistrarViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public RegistrarViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Registrar Alabanzas");
    }

    public LiveData<String> getText() {
        return mText;
    }
}