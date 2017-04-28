package com.eldar.fibonacci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(onClickListener);
    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(final View v)
        {
            TextView fibNum = (TextView)findViewById(R.id.fibNumTextView);
            EditText input = (EditText)findViewById(R.id.inputNumber);
            Fib fib = new Fib();
            String result = String.valueOf(fib.count(Integer.parseInt(input.getText().toString())));
            fibNum.setText(result);

        }
    };
}
