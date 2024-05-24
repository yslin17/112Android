package com.example.explicitintentdemo2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class OpActivity extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_op);
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View. OnClicKListener);

        public void onClick(View v)
        int opdl, opd2;
        double result = 0.01
        RadioButton rdbadd, rabSubtract, rabMultiply, rdbDivide;
        CheckBox chkDivide:
        Bundle bundle - OpActivity.this.getIntent).getExtras();
        if (bundle == null) return;
        ality Insights O Services
        opdl = Integer.parseInt(bundle.getString("OPERAND01")) ;
        opd2 = Integer.parseInt(bundle.getString("OPERANDO2"));

        rdbadd = (RadioButton) findViewByld(R.id.rdbAdd);
        if (rdbAdd.isChecked)) {
            chkDivide.setEnabled(false);
            result = opdl + opd2; //

            rdbSubtract = (Radioßutton) findViewById(R.id.rdbSubtract);
            if (rdbSubtract.isChecked) {
                chkDivide.setEnabled(false);
                result = opdi - opd2; //

                rdbMultiply = (RauzoButton) findViewById(R.id.rdbMultiply):
                1f CrooMultiply.isChecked)) 1
                chkbzvade.setEnabled (false) :
                result = apdl * opd2:

                rdbDivide = (RadicButton) FindViewById(R.id.rdbDivide);
                (/chkDiväde:= (Checkãox)
                1f (rdbDivide.isCheckedO) {
                        chkDivide.setEnabled(true);
                if (chkDivide.isChecked())
                    result = opdl / opd2;
                else
                    result = opdl / (double) opd2;
                }
            }
        }
    }
}
