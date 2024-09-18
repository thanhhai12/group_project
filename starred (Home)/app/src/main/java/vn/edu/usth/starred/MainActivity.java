package vn.edu.usth.starred;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Xử lý nút quay lại
        ImageView backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Đóng Activity hiện tại và quay lại màn hình trước đó
                finish();
            }
        });

        // Xử lý nút "Explore repositories"
        TextView exploreButton = findViewById(R.id.exploreButton);
        exploreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển hướng người dùng đến trang khám phá (Explore)
                Intent intent = new Intent(MainActivity.this, ExploreRepositoriesActivity.class);
                startActivity(intent);
            }
        });
    }
}
