package vn.edu.usth.github;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class TrendRepoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trend_repo);

        // Back button functionality
        findViewById(R.id.backButton).setOnClickListener(v -> onBackPressed());

        // Handle Today Button click to show popup menu
        Button todayButton = findViewById(R.id.todayButton);
        todayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create PopupMenu
                PopupMenu popupMenu = new PopupMenu(TrendRepoActivity.this, todayButton);
                // Inflate the popup menu from the resource
                popupMenu.getMenuInflater().inflate(R.menu.trending_time_menu, popupMenu.getMenu());
                // Set the click listener for each item
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        int itemId = item.getItemId();

                        // Use if-else instead of switch-case
                        if (itemId == R.id.menu_today) {
                            todayButton.setText("Today");
                            Toast.makeText(TrendRepoActivity.this, "Today selected", Toast.LENGTH_SHORT).show();
                            return true;
                        } else if (itemId == R.id.menu_this_week) {
                            todayButton.setText("This Week");
                            Toast.makeText(TrendRepoActivity.this, "This Week selected", Toast.LENGTH_SHORT).show();
                            return true;
                        } else if (itemId == R.id.menu_this_month) {
                            todayButton.setText("This Month");
                            Toast.makeText(TrendRepoActivity.this, "This Month selected", Toast.LENGTH_SHORT).show();
                            return true;
                        } else {
                            return false;
                        }
                    }
                });
                // Show the popup menu
                popupMenu.show();
            }
        });

        // Handle Language Button click to show popup menu
        Button languageButton = findViewById(R.id.languageButton);
        languageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create PopupMenu
                PopupMenu popupMenu = new PopupMenu(TrendRepoActivity.this, languageButton);
                // Inflate the popup menu from the resource
                popupMenu.getMenuInflater().inflate(R.menu.language_menu, popupMenu.getMenu());
                // Set the click listener for each item
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        int itemId = item.getItemId();

                        // Use if-else instead of switch-case
                        if (itemId == R.id.menu_java) {
                            languageButton.setText("Java");
                            Toast.makeText(TrendRepoActivity.this, "Java selected", Toast.LENGTH_SHORT).show();
                            return true;
                        } else if (itemId == R.id.menu_python) {
                            languageButton.setText("Python");
                            Toast.makeText(TrendRepoActivity.this, "Python selected", Toast.LENGTH_SHORT).show();
                            return true;
                        } else if (itemId == R.id.menu_c) {
                            languageButton.setText("C");
                            Toast.makeText(TrendRepoActivity.this, "C selected", Toast.LENGTH_SHORT).show();
                            return true;
                        } else if (itemId == R.id.menu_cpp) {
                            languageButton.setText("C++");
                            Toast.makeText(TrendRepoActivity.this, "C++ selected", Toast.LENGTH_SHORT).show();
                            return true;
                        } else {
                            return false;
                        }
                    }
                });
                // Show the popup menu
                popupMenu.show();
            }
        });

        // Handle Spoken Language Button click to show popup menu
        Button spokenLanguageButton = findViewById(R.id.spokenLanguageButton);
        spokenLanguageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create PopupMenu
                PopupMenu popupMenu = new PopupMenu(TrendRepoActivity.this, spokenLanguageButton);
                // Inflate the popup menu from the resource
                popupMenu.getMenuInflater().inflate(R.menu.spoken_language_menu, popupMenu.getMenu());
                // Set the click listener for each item
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        int itemId = item.getItemId();

                        // Use if-else instead of switch-case
                        if (itemId == R.id.menu_english) {
                            spokenLanguageButton.setText("English");
                            Toast.makeText(TrendRepoActivity.this, "English selected", Toast.LENGTH_SHORT).show();
                            return true;
                        } else if (itemId == R.id.menu_vietnamese) {
                            spokenLanguageButton.setText("Vietnamese");
                            Toast.makeText(TrendRepoActivity.this, "Vietnamese selected", Toast.LENGTH_SHORT).show();
                            return true;
                        } else if (itemId == R.id.menu_french) {
                            spokenLanguageButton.setText("French");
                            Toast.makeText(TrendRepoActivity.this, "French selected", Toast.LENGTH_SHORT).show();
                            return true;
                        } else if (itemId == R.id.menu_japanese) {
                            spokenLanguageButton.setText("Japanese");
                            Toast.makeText(TrendRepoActivity.this, "Japanese selected", Toast.LENGTH_SHORT).show();
                            return true;
                        } else {
                            return false;
                        }
                    }
                });
                // Show the popup menu
                popupMenu.show();
            }
        });
    }
}
