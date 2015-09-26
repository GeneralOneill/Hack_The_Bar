package com.parse.starter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.facebook.FacebookSdk;
import com.facebook.login.LoginResult;

public class RegisterCustomer extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_customer);
        Button register = (Button)findViewById(R.id.btnRegister);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), LandingActivity.class);
                String name = ((EditText)findViewById(R.id.reg_fullname)).getText().toString();
                String email = ((EditText)findViewById(R.id.reg_email)).getText().toString();
                String password = ((EditText)findViewById(R.id.reg_password)).getText().toString();
            }
        });
    }
}
