package com.bitpolarity.careify;
import com.bitpolarity.careify.R;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class Registration_Step2
        extends AppCompatActivity
         {


             @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_step2);

        startActivity(new Intent(Registration_Step2.this, HomeActivity.class));

    }



         }