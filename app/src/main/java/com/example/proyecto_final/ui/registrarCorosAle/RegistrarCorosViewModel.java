package com.example.proyecto_final.ui.registrarCorosAle;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RegistrarCorosViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public RegistrarCorosViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Registrar Coros Alegres");
    }

    public LiveData<String> getText() {
        return mText;
    }
}