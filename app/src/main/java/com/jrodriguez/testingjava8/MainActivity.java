package com.jrodriguez.testingjava8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText textOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button testLambdas = (Button) findViewById(R.id.testLambda);
        Button testFR = (Button) findViewById(R.id.testFR);
        Button testStreams = (Button) findViewById(R.id.testStream);
        Button clear = (Button) findViewById(R.id.clear);

        textOutput = (EditText) findViewById(R.id.textOutput);

        testLambdas.setOnClickListener(view -> { setText(getString(R.string.hello_lambdas)); });
        testFR.setOnClickListener(this::setTextFR);
        testStreams.setVisibility(View.GONE);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setText("");
            }
        });
    }

    void setText(String text) {
        textOutput.setText(text);
    }

    void setTextFR(View view) {
        this.setText(getString(R.string.hello_function_references));
    }
}
