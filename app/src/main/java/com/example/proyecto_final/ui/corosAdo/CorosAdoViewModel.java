package com.example.proyecto_final.ui.corosAdo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CorosAdoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CorosAdoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Coros de adoración");
    }

    public LiveData<String> getText() {
        return mText;
    }
}