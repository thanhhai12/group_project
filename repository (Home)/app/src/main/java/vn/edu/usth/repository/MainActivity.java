package vn.edu.usth.repository;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Lấy các view của từng repository
        LinearLayout repo1 = findViewById(R.id.repo1);
        LinearLayout repo2 = findViewById(R.id.repo2);
        LinearLayout repo3 = findViewById(R.id.repo3);
        LinearLayout repo4 = findViewById(R.id.repo4);

        // Xử lý khi bấm vào repo 1
        repo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Mở RepositoryDetailActivity với thông tin cụ thể cho repo1
                Intent intent = new Intent(MainActivity.this, RepositoryDetailActivity.class);
                intent.putExtra("name", "demo_api");
                intent.putExtra("stars", "0");
                intent.putExtra("forks", "0");
                intent.putExtra("forkedFrom", "N/A");
                intent.putExtra("description", "Demo API repository");
                startActivity(intent);
            }
        });

        // Xử lý khi bấm vào repo 2
        repo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RepositoryDetailActivity.class);
                intent.putExtra("name", "mobiledev2024");
                intent.putExtra("stars", "0");
                intent.putExtra("forks", "0");
                intent.putExtra("forkedFrom", "SonTG/mobiledev2024");
                intent.putExtra("description", "USTH ICT Android Development 2024\n- 22BI13148\n- To Thanh Hai\n- Class 1");
                startActivity(intent);
            }
        });

        // Xử lý khi bấm vào repo 3
        repo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RepositoryDetailActivity.class);
                intent.putExtra("name", "pp2024");
                intent.putExtra("stars", "0");
                intent.putExtra("forks", "0");
                intent.putExtra("forkedFrom", "SonTG/pp2024");
                intent.putExtra("description", "Python project for 2024");
                startActivity(intent);
            }
        });

        // Xử lý khi bấm vào repo 4
        repo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RepositoryDetailActivity.class);
                intent.putExtra("name", "thanhhai12");
                intent.putExtra("stars", "0");
                intent.putExtra("forks", "0");
                intent.putExtra("forkedFrom", "N/A");
                intent.putExtra("description", "");
                startActivity(intent);
            }
        });
    }
}
