package com.example.proyecto_final.ui.registrarCorosAdo;

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

public class RegistrarCorosAdoFragment extends Fragment {

    private RegistrarCorosAdoViewModel RegistrarCororAdoFragment;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        RegistrarCororAdoFragment =
                ViewModelProviders.of(this).get(RegistrarCorosAdoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_registrar_coros_ado, container, false);
        final TextView textView = root.findViewById(R.id.text_registrarCorosAdo);
        RegistrarCororAdoFragment.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}