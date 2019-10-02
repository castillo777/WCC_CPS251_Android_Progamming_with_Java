package com.example.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calculateTipButton = findViewById(R.id.calculateTipButton);

        calculateTipButton.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        final EditText enterAmountView = findViewById(R.id.enterAmountView);
                        final TextView outputText = findViewById(R.id.outputView);

                        if (!enterAmountView.getText().toString().equals("")) {
                            double totalAmount =
                                    Double.parseDouble(enterAmountView.getText().toString());
                            TipCalculator calculator = new TipCalculator();
                            calculator.calculateTip(totalAmount);
                            outputText.setText((calculator.displayTipResults()));
                        } else
                            outputText.setText(R.string.error_message);
                    }
                }
        );
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        final TextView textView = findViewById(R.id.outputView);
        CharSequence outputText = textView.getText();
        outState.putCharSequence("savedText", outputText);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        final TextView textView = findViewById(R.id.outputView);
        CharSequence outputText = savedInstanceState.getCharSequence("savedText");
        textView.setText(outputText);
    }
}
