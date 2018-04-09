package com.example.android.lesson10;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.lesson10.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.

        ImageView cookieImageView = findViewById(R.id.android_cookie_image_view);
        cookieImageView.setImageResource(R.drawable.after_cookie);


        // TODO: Find a reference to the TextView in the layout. Change the text.
        TextView status_text_view= findViewById(R.id.status_text_view);
        status_text_view.setText("I'm so full");

    }
}