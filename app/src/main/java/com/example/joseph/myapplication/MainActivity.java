package com.example.joseph.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(new handleButton());
    }

    class handleButton implements View.OnClickListener {
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, Screen2.class);
            startActivity(intent);
        }
    }
    protected void onActivityResult(int RequestCode, int resultCode, Intent data){
        if(data != null && data.hasExtra("Order")){
            Toast.makeText(this, data.getStringExtra("Order") + "ordered.", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "NothingOrdered!", Toast.LENGTH_LONG);

        }
    }
}
