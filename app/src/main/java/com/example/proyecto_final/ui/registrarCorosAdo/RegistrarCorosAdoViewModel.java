package com.example.proyecto_final.ui.registrarCorosAdo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RegistrarCorosAdoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public RegistrarCorosAdoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Registrar Coros Adoración");
    }

    public LiveData<String> getText() {
        return mText;
    }
}