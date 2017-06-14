package io.paulortvalle.graphicsbubbleprogram;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.frame);

        ImageView bubbleView = new ImageView(getApplicationContext());
        bubbleView.setImageDrawable(getResources().getDrawable(R.drawable.b512));

        int width = (int) getResources().getDimension(R.dimen.image_width);
        int height = (int) getResources().getDimension(R.dimen.image_height);

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(width, height);
        params.addRule(RelativeLayout.CENTER_IN_PARENT);

        bubbleView.setLayoutParams(params);

        relativeLayout.addView(bubbleView);

    }
}
