package io.paulortvalle.singlebroadcaststaticregistration;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private static final String CUSTOM_INTENT = "io.paulortvalle.singlebroadcaststaticregistration.show_toast";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sendBroadcast(new Intent(CUSTOM_INTENT),
                        android.Manifest.permission.VIBRATE);
            }
        });

    }
}
