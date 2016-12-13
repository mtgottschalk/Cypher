package com.example.leoth_000.cypher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainPage extends AppCompatActivity {
    static String TAG = "MainEncode";
    Encoder myEncoder;
    Decoder myDecoder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encode_page);
        Log.i(TAG, "Application is running!");
        // Basic page to encode a message

       final EditText editUser = (EditText)(findViewById(R.id.editText_user));
        final EditText editShift = (EditText)(findViewById(R.id.editText_shift));
       final TextView textCoded = (TextView)(findViewById(R.id.txt_coded));
        Button btnEncode =(Button)(findViewById(R.id.btnEncode));
        btnEncode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Encode Clicked");
                String print = "";
                String userText = editUser.getText().toString();
                int shiftInt = Integer.parseInt(editShift.getText().toString());
                myEncoder = new Encoder(userText,shiftInt);
                myEncoder.encode();
                int[] outCoded = myEncoder.getCodedText();
               for (int x = 0; x < userText.length(); x=x+1){
                   print = print+outCoded[x]+" ";
               }
                textCoded.setText(print);
            }
        });
        Button btnDecode = (Button)(findViewById(R.id.btnDecode));
        btnDecode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Decode Clicked");
                String message = "";
                String userText = editUser.getText().toString();
                int shiftInt = Integer.parseInt(editShift.getText().toString());
                myDecoder = new Decoder(userText,shiftInt);
               message = myDecoder.decode();
                textCoded.setText(message);
            }
        });
        Button btnBreak = (Button)(findViewById(R.id.btnBreak));
        btnBreak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Break Clicked");
                String userText = editUser.getText().toString();
                int shiftInt = Integer.parseInt(editShift.getText().toString());
                textCoded.setText("Break");
            }
        });
    }
}