package labs.sem01.seminar01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView tv_second = findViewById(R.id.tvMessage);
        tv_second.setText("Welcome to the second activity!");
    }
}
