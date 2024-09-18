package vn.edu.usth.organization;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

import vn.edu.usth.organization.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Tìm LinearLayout của nút quay lại bằng ID
        LinearLayout backButton = findViewById(R.id.backButton);

        // Xử lý sự kiện khi nhấn nút quay lại
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Quay trở lại màn hình trước đó
                finish();
            }
        });
    }
}
