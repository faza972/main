package com.project.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private FragmentContainerView fragmentContainerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Ensure this is your main activity layout file

        // Initialize views without data binding
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        fragmentContainerView = findViewById(R.id.fragmentContainer);

        // Setup navigation
        NavHostFragment navHostFragment = (NavHostFragment)
                getSupportFragmentManager().findFragmentById(R.id.fragmentContainer);
        if (navHostFragment != null) {
            NavigationUI.setupWithNavController(bottomNavigationView,
                    navHostFragment.getNavController());

            navHostFragment.getNavController().addOnDestinationChangedListener(
                    (controller, destination, arguments) -> {
                        // Handle destination changes if needed
                    }
            );
        }
    }
}