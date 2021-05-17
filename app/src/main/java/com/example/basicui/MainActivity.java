package com.example.basicui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button b1;
    private EditText et1;
    private String toastText = "Test";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1.findViewById(R.id.button);
        et1.findViewById(R.id.editText);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!et1.getText().toString().matches("")){
                    toastText=et1.getText().toString();

                }
                Toast.makeText(MainActivity.this, toastText, Toast.LENGTH_SHORT ).show();
            }
        });

    }
}