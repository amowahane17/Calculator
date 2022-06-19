package com.example.calculator_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText eFirstV, eSecondV;
    TextView ans;
    Button add , subtract , multiply, divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eFirstV = findViewById(R.id.eVal_1);
        eSecondV = findViewById(R.id.eVal_2);

        ans = findViewById(R.id.result);

        add = findViewById(R.id.add_button);
        subtract = findViewById(R.id.minus_button);
        multiply = findViewById(R.id.multi_button);
        divide = findViewById(R.id.div_button);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, secondValue, mainAns;

                firstValue = Integer.parseInt(eFirstV.getText().toString());
                secondValue = Integer.parseInt(eSecondV.getText().toString());

                mainAns = firstValue + secondValue;

                ans.setText("Ans is "+mainAns);

            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, secondValue, mainAns;

                firstValue = Integer.parseInt(eFirstV.getText().toString());
                secondValue = Integer.parseInt(eSecondV.getText().toString());

                mainAns = firstValue - secondValue;

                ans.setText("Ans is "+mainAns);

            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, secondValue, mainAns;

                firstValue = Integer.parseInt(eFirstV.getText().toString());
                secondValue = Integer.parseInt(eSecondV.getText().toString());

                mainAns = firstValue * secondValue;

                ans.setText("Ans is "+mainAns);

            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, secondValue, mainAns;

                firstValue = Integer.parseInt(eFirstV.getText().toString());
                secondValue = Integer.parseInt(eSecondV.getText().toString());

                mainAns = firstValue / secondValue;

                ans.setText("Ans is "+mainAns);

            }
        });


    }
}