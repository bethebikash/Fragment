package com.bhattaraibikash.fragment.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.bhattaraibikash.fragment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment implements View.OnClickListener {

    private Button btnCalculateArea;
    private EditText etRadius;


    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        etRadius = view.findViewById(R.id.etRadius);
        btnCalculateArea = view.findViewById(R.id.btnCalculateArea);

        btnCalculateArea.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        float radius = Float.parseFloat(etRadius.getText().toString());
        float area = 3.143f * radius * radius;

        Toast.makeText(getActivity(),"Area of Circle is : " + area, Toast.LENGTH_SHORT).show();
    }
}
