package labs.sem01.seminar01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

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

    }
}
