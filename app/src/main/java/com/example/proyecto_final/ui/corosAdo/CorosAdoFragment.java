package com.example.proyecto_final.ui.corosAdo;

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

public class CorosAdoFragment extends Fragment {

    private CorosAdoViewModel CorosAdoFragment;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        CorosAdoFragment =
                ViewModelProviders.of(this).get(CorosAdoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_coros_ado, container, false);
        final TextView textView = root.findViewById(R.id.text_corosAdo);
        CorosAdoFragment.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}