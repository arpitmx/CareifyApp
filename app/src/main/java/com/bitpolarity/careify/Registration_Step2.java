package com.bitpolarity.careify;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


public class Registration_Step2
        extends AppCompatActivity
         {


             @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_step2);

        startActivity(new Intent(Registration_Step2.this, Main_Holder.class));

    }



         }