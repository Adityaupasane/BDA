package com.donor.bda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SelectRegisrtationActivity extends AppCompatActivity {

    private Button donorButton,recipientButton;
    private backbutton
    private TextView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_regisrtation);

        donorButton = findViewById(R.id.donorButton);
        recipientButton = findViewById(R.id.recipientButton);
        backbutton = findViewById(R.id.backButton);

        donorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent - = new Intent(SelectRegisrtationActivity.this, DonorRegistrationActivity.class);
                startActivity(intent);
            }
        });

        recipientButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent - = new Intent(SelectRegisrtationActivity.this, RecipientRegistrationActivity.class);
                startActivity(intent);
            }
        });
    }
}

























