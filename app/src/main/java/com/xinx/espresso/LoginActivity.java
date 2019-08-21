package com.xinx.espresso;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText nameInput;
    private EditText passwordInput;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        nameInput = findViewById(R.id.input_name);
        passwordInput = findViewById(R.id.input_password);
    }

    public void login(View view) {
        String name = nameInput.getText().toString();
        String password = passwordInput.getText().toString();
        if ("admin".equals(name) && "123456".equals(password)) {
            startActivity(new Intent(this, MainActivity.class));
        }
    }
}

