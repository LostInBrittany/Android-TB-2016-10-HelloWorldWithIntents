package org.lostinbrittany.android.teaching.helloworldwithintents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HelloActivity extends AppCompatActivity {


    TextView txtHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        txtHello = (TextView) findViewById(R.id.textHello);

        Bundle extras = getIntent().getExtras();
        String name = extras.getString("name");

        txtHello.setText("Hello "+name);

    }
}
