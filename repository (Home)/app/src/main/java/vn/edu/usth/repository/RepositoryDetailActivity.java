package vn.edu.usth.repository;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class RepositoryDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repository_detail);

        // Nhận dữ liệu từ Intent
        String name = getIntent().getStringExtra("name");
        String stars = getIntent().getStringExtra("stars");
        String forks = getIntent().getStringExtra("forks");
        String forkedFrom = getIntent().getStringExtra("forkedFrom");
        String description = getIntent().getStringExtra("description");

        // Gán dữ liệu cho các TextView
        TextView repoName = findViewById(R.id.repoName);
        TextView repoStars = findViewById(R.id.repoStars);
        TextView repoForks = findViewById(R.id.repoForks);
        TextView repoForkedFrom = findViewById(R.id.repoForkedFrom);
        TextView repoDescription = findViewById(R.id.repoDescription);

        repoName.setText(name);
        repoStars.setText("★ " + stars + " stars");
        repoForks.setText("⑂ " + forks + " forks");
        repoForkedFrom.setText("Forked from " + forkedFrom);
        repoDescription.setText(description);

        // Xử lý nút quay lại
        LinearLayout backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Quay trở lại màn hình trước đó
                finish();
            }
        });
    }
}
