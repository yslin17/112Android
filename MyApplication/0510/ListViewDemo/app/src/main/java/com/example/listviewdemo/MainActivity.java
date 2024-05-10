package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private  ListView lv;
    private String[] cities;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnConfirm = (Button) findViewById(R.id.button);
        btnConfirm.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                String[]steaks = getResources().getStringArray(R.array.steaks);
                Spinner sp = (Spinner)findViewById(R.id.spinner);
                int index = sp.getSelectedItemPosition();
                Log.v("SelectPosition",String.valueOf(index));
                TextView output = (TextView) findViewById(R.id.lblOutput);
                output.setText("牛排要"+sp.getSelectedItem().toString());
            }
        });
    }
}
