package labs.sem01.seminar01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        if (getIntent().getStringExtra("nom") == null) {
            TextView tv_second = findViewById(R.id.tvMessage);
            tv_second.setText("Welcome to the second activity!");
        } else {
            TextView tv_s2 = findViewById(R.id.tvMessage);
            tv_s2.setText("Welcome to the second activity, " + getIntent().getStringExtra("nom"));
        }
    }

    @Override
    public void onBackPressed(){
        Intent intent = new Intent();
        intent.putExtra("result", "Come back soon!");
        setResult(RESULT_OK, intent);

        super.onBackPressed();
    }
}
