package com.example.loginpendaftaran;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("Anda perlu gabung AH hooky team");


    }

    @Override
    public Intent getIntent() {
        return super.getIntent();
    }
}
