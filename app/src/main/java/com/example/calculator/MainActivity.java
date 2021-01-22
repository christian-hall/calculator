package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double valueOne;
    double valueTwo;
    private static final char ADDITION = '+';
    private static final char SUBTRACTION = '-';
    private static final char MULTIPLICATION = '*';
    private static final char DIVISION = '/';
    private char CURRENT_ACTION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button zero = (Button) findViewById(R.id.ZeroButton);
        Button one = (Button) findViewById(R.id.OneButton);
        Button two = (Button) findViewById(R.id.TwoButton);
        Button three = (Button) findViewById(R.id.ThreeButton);
        Button four = (Button) findViewById(R.id.FourButton);
        Button five = (Button) findViewById(R.id.FiveButton);
        Button six = (Button) findViewById(R.id.SixButton);
        Button seven = (Button) findViewById(R.id.SevenButton);
        Button eight = (Button) findViewById(R.id.EightButton);
        Button nine = (Button) findViewById(R.id.NineButton);
        Button equals = (Button) findViewById(R.id.EqualsButton);
        Button divide = (Button) findViewById(R.id.Dividebutton);
        Button multiply = (Button) findViewById(R.id.MultiplyButton);
        Button subtract = (Button) findViewById(R.id.SubtractButton);
        Button plusminus = (Button) findViewById(R.id.PlusMinusButton);
        Button decimal = (Button) findViewById(R.id.DecimalButton);
        Button clear = (Button) findViewById(R.id.ClearButton);
        TextView entry = (TextView) findViewById(R.id.EntryView);
        TextView progress = (TextView) findViewById(R.id.ProgressView);




    }
}