package com.example.proyecto_final.ui.registrarCorosAle;

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

public class RegistrarCorosFragment extends Fragment {

    private RegistrarCorosViewModel RegistrarCorosFragment;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        RegistrarCorosFragment =
                ViewModelProviders.of(this).get(RegistrarCorosViewModel.class);
        View root = inflater.inflate(R.layout.fragment_registrar_coros, container, false);
        final TextView textView = root.findViewById(R.id.text_registrarCoros);
        RegistrarCorosFragment.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}