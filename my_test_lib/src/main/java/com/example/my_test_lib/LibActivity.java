package com.example.my_test_lib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LibActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lib);
    }

    public void goBack(View view) {

        Intent intent = new Intent();
        intent.putExtra("result", "Test Result");
        setResult(RESULT_OK, intent);
        finish();
    }
}
