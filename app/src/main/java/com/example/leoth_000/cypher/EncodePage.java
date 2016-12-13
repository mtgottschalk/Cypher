package com.example.leoth_000.cypher;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EncodePage extends AppCompatActivity {
    static String TAG = "MainEncode";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encode_page);
        Log.i(TAG, "Application is running!");
        // Basic page to encode a message

       final EditText editClear = (EditText)(findViewById(R.id.editText_clear));
       final TextView textCoded = (TextView)(findViewById(R.id.txt_coded));
        Button btnEncode =(Button)(findViewById(R.id.btnEncode));
        btnEncode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Button Clicked");
                String clearText = editClear.getText().toString();
                textCoded.setText(clearText);
            }
        });
    }
}
