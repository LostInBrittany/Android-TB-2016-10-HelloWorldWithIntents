package org.lostinbrittany.android.teaching.helloworldwithintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName = (EditText) findViewById(R.id.editTextName);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Button b = (Button)findViewById(R.id.buttonOK);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = txtName.getText().toString();

                Intent helloIntent =
                        new Intent("org.lostinbrittany.android.teaching.helloworldwithintents.HELLO");
                helloIntent.putExtra("name", name);
                startActivity(helloIntent);
            }
        });
    }
}
