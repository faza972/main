package com.project.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.project.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        NavHostFragment navHostFragment = (NavHostFragment)
                getSupportFragmentManager().findFragmentById(R.id.fragmentContainer);
        if (navHostFragment != null) {
            NavigationUI.setupWithNavController(binding.bottomNavigationView,
                    navHostFragment.getNavController());

            navHostFragment.getNavController().addOnDestinationChangedListener(
                    (controller, destination, arguments) -> {
                        // Handle destination changes if needed
                    }
            );
        }
    }
}