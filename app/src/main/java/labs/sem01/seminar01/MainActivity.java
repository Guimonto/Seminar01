package labs.sem01.seminar01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Lifecycle";

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "Starting the activity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "Destroying the activity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(TAG, "Restarting the activity");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, "Stopping the activity");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "Pausing the activity");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "Resuming the activity");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "Creating the activity");

        TextView tvi = (TextView) findViewById(R.id.tvDynamicTextInt);
        tvi.setText(R.string.dynamic_int);

        TextView tvs = (TextView) findViewById(R.id.tvDynamicTextString);
        tvs.setText(R.string.dynamic_string);

        Button button = findViewById(R.id.button);
        button.setText("onClickListener by code and Explicit Intent");
        /*button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.button, Toast.LENGTH_LONG).show();
            }
        });*/

        Button button1 = findViewById(R.id.button2);
        button1.setText("onClickListener from layout");

    }

    public void displayMessage(View v){
        Toast.makeText(MainActivity.this, R.string.button2, Toast.LENGTH_LONG).show();
    }

    public void launchExplicitIntent(View v){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

}
