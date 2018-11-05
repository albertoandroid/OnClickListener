package com.androiddesdecero.onclicklistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Set;

public class MainActivity extends AppCompatActivity {

    private Button play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play = findViewById(R.id.btPlay);
        play.setOnClickListener(clickListener);
    }

    private View.OnClickListener clickListener =
        new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("TAG", "Pulsado Play");
            }
        };
}
