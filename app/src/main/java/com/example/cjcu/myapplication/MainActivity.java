package com.example.cjcu.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    private EditText BG;
    private EditText NLL;
    private EditText CKCS;
    private Button button;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.BG=findViewById(R.id.BG);
        this.NLL=findViewById(R.id.NLL);
        this.CKCS=findViewById(R.id.CKCS);
        this.button=findViewById(R.id.button);
        this.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double calculate=Double.parseDouble(BG.getText().toString())*Math.pow((Double.parseDouble(NLL.getText().toString()))/12/100+1,Double.parseDouble(CKCS.getText().toString()));
                result.setText("本利和為:"+(int)calculate);
            }
        });
        this.result=findViewById(R.id.result);
    }
}
