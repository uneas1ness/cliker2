package com.example.cliker2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int chislo = 0;
    int chslo1 = 1;
    Button click;
    TextView schetchik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click =(Button)findViewById(R.id.button);
        schetchik =(TextView)findViewById(R.id.textView);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chislo += chslo1;
                schetchik.setText(chislo + "");
            }
        });

    }
}