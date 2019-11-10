package com.example.proyecto_final.ui.coros;

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


public class CorosFragment extends Fragment {

    private corosViewModel corosFragment;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        corosFragment =
                ViewModelProviders.of(this).get(corosViewModel.class);
        View root = inflater.inflate(R.layout.fragment_coros, container, false);
        final TextView textView = root.findViewById(R.id.text_coros);
        corosFragment.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}