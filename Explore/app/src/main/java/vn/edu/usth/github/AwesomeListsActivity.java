package vn.edu.usth.github;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class AwesomeListsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awesome_lists);

        // Back button functionality
        findViewById(R.id.backButton).setOnClickListener(v -> onBackPressed());
    }
}
