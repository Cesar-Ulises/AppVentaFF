package com.example.proyecto_final.ui.registrar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.proyecto_final.R;

public class RegistrarFragment extends Fragment {

    private RegistrarViewModel RegistrarFragment;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        RegistrarFragment =
                ViewModelProviders.of(this).get(RegistrarViewModel.class);
        View root = inflater.inflate(R.layout.fragment_registrar, container, false);

        return root;
    }
}