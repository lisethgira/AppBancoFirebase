package com.example.appbancofirebase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // invocar el fragment en el mainactivity
        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().replace(R.id.frlogin,new InicioSesionFragment()).commit();
    }

}