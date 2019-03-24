package com.example.test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);

        final ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.neko1);


        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // flagがtrueの時
                if (flag) {

                    imageView.setVisibility(View.INVISIBLE);
                    flag = false;

                } else {

                    imageView.setVisibility(View.VISIBLE);
                    flag = true;

                }
            }

        });


    }
}
