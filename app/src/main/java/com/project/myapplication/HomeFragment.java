package com.project.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HomeFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        NavController navController = Navigation.findNavController(view);

        CardView cvDay1 = view.findViewById(R.id.cv_day1);
        CardView cvDay2 = view.findViewById(R.id.cv_day2);

//        cvDay1.setOnClickListener(v -> navController.navigate(R.id.action_homeFragment_to_orderFragment));
//        cvDay2.setOnClickListener(v -> navController.navigate(R.id.action_homeFragment_to_orderFragment));
    }
}



