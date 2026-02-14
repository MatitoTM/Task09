package com.example.task09;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText eT;
    Button btn;
    String etStr;
    int etInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eT = findViewById(R.id.eT);
        btn = findViewById(R.id.btn);
    }

    public void clicked(View view) {
        etStr = eT.getText().toString();
        etInt = Integer.parseInt(etStr);

        if (etInt % 7 == 0)
        {
            btn.setText("BOOM!");
            eT.setText("");
        }
        else
        {
            btn.setText(etStr);
            eT.setText("");
        }
    }
}