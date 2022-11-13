package com.practicas.pmdm.checkboxoneselection_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cb1;
    CheckBox cb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb1 = (CheckBox) findViewById(R.id.cb1);
        cb2 = (CheckBox) findViewById(R.id.cb2);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.btnSend) {
            validate();
        }
    }

    private void validate() {
        String btnChecked = "";

        if(cb1.isChecked() && cb2.isChecked()) {
            btnChecked = "Error, no está permitida la selección múltiple.";
        } else if(cb1.isChecked()) {
            btnChecked = (String) cb1.getText();
        } else if(cb2.isChecked()) {
            btnChecked = (String) cb2.getText();
        } else {
            btnChecked = "No se ha seleccionado ningún checkbox.";
        }
        Toast.makeText(getApplicationContext(), btnChecked, Toast.LENGTH_SHORT).show();
    }

}