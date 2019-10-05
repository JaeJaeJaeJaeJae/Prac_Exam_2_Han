package com.example.goomba.prac_exam_2_han;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    CheckBox check1;
    CheckBox check2;
    CheckBox check3;
    CheckBox check4;
    CheckBox check5;
    CheckBox check6;
    CheckBox check7;
    CheckBox check8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkbox();
    }

    private void checkbox() {
        check1 = (CheckBox) findViewById(R.id.check1);
        check2 = (CheckBox) findViewById(R.id.check2);
        check3 = (CheckBox) findViewById(R.id.check3);
        check4 = (CheckBox) findViewById(R.id.check4);
        check5 = (CheckBox) findViewById(R.id.check5);
        check6 = (CheckBox) findViewById(R.id.check6);
        check7 = (CheckBox) findViewById(R.id.check7);
        check8 = (CheckBox) findViewById(R.id.check8);
        Button get_view_button = (Button) findViewById(R.id.save);
        get_view_button.setOnClickListener(get_view_button_listener);
    }
    private Button.OnClickListener get_view_button_listener = new Button.OnClickListener() {
        public void onClick(View v) {
            String r = "";
            if (check1.isChecked()) {
                r = r + "," + check1.getText();
            }
            if (check2.isChecked()) {
                r = r + "," + check2.getText();
            }
            if (check3.isChecked()) {
                r = r + "," + check3.getText();
            }
            if (check4.isChecked()) {
                r = r + "," + check4.getText();
            }
            if (check5.isChecked()) {
                r = r + "," + check5.getText();
            }
            if (check6.isChecked()) {
                r = r + "," + check6.getText();
            }
            if (check7.isChecked()) {
                r = r + "," + check7.getText();
            }
            if (check8.isChecked()) {
                r = r + "," + check8.getText();
            }
            setTitle("Checked: " + r);
        }
    };
}
