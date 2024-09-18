package vn.edu.usth.github;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private boolean isStarred = false; // To keep track of the star state

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize BottomNavigationView
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        // Set default selected item (Explore)
        bottomNavigationView.setSelectedItemId(R.id.navigation_explore);

        // Handle bottom navigation item clicks
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();
                if (itemId == R.id.navigation_home) {
                    Toast.makeText(MainActivity.this, "Home selected", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (itemId == R.id.navigation_notifications) {
                    Toast.makeText(MainActivity.this, "Notifications selected", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (itemId == R.id.navigation_explore) {
                    Toast.makeText(MainActivity.this, "Explore selected", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (itemId == R.id.navigation_profile) {
                    Toast.makeText(MainActivity.this, "Profile selected", Toast.LENGTH_SHORT).show();
                    return true;
                }
                return false;
            }
        });

        // Handle click event for "Awesome Lists" layout
        LinearLayout awesomeListsLayout = findViewById(R.id.awesomeListsLayout); // Ensure this ID matches your XML layout ID
        awesomeListsLayout.setOnClickListener(v -> {
            // Navigate to AwesomeListsActivity
            Intent intent = new Intent(MainActivity.this, AwesomeListsActivity.class);
            startActivity(intent);
        });

        // Handle click event for "Trending Repositories" layout
        LinearLayout trendingRepoLayout = findViewById(R.id.trendingRepoLayout); // Ensure this ID matches your XML layout ID
        trendingRepoLayout.setOnClickListener(v -> {
            // Navigate to TrendRepoActivity
            Intent intent = new Intent(MainActivity.this, TrendRepoActivity.class);
            startActivity(intent);
        });

        // Initialize Star button, Add to List button, and Contributor TextView
        LinearLayout starButtonLayout = findViewById(R.id.starButtonLayout);
        ImageView starIconInButton = findViewById(R.id.starIconInButton);
        TextView starButtonText = findViewById(R.id.starButtonText);
        Button addToListButton = findViewById(R.id.addToListButton);

        // Initially hide the "Add to List" button
        addToListButton.setVisibility(View.GONE);

        // Star Button click listener
        starButtonLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isStarred) {
                    // Change the button to "Starred" and update the icon
                    starButtonText.setText("Starred");
                    starIconInButton.setColorFilter(Color.YELLOW); // Set star icon to yellow
                    starButtonText.setTextColor(Color.YELLOW); // Change text color to yellow

                    // Show the "Add to List" button
                    addToListButton.setVisibility(View.VISIBLE);

                    // Mark as starred
                    isStarred = true;
                }
            }
        });
        // Show Bottom Sheet when "Add to List" is clicked
        addToListButton.setOnClickListener(v -> {
            SelectListBottomSheet bottomSheet = new SelectListBottomSheet();
            bottomSheet.show(getSupportFragmentManager(), "SelectListBottomSheet");
        });
    }
}
