package com.example.checkboxdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox chkOriginal , chkBeef , chkSeafood;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkOriginal = (CheckBox) findViewById(R.id.chkOriginal);
        chkBeef = (CheckBox) findViewById(R.id.chkBeef);
        chkSeafood = (CheckBox) findViewById(R.id.chkSeafood );

        output = (TextView) findViewById(R.id.lblOutput);

        Button btnConfirm = (Button) findViewById(R.id.btnConfirm);
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = "";
                if(chkOriginal.isChecked())str += chkOriginal.getText() + "\n";
                if(chkBeef.isChecked()) str += chkBeef.getText() + "\n";
                if(chkSeafood.isChecked()) str += chkSeafood.getText() + "\n";
output.setText(str);
}

});
}
}