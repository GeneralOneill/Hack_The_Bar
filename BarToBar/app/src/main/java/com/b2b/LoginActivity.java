package com.b2b;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.parse.LogInCallback;
import com.parse.ParseAnalytics;
import com.parse.ParseException;
import com.parse.ParseUser;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        if (ParseUser.getCurrentUser()!= null) {
            Intent intent = new Intent(this, LandingActivity.class);
            startActivity(intent);
        }
        Button loginButton = (Button)findViewById(R.id.btnLogin);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                String email = ((EditText) findViewById(R.id.login_email)).getText().toString();
                String password = ((EditText) findViewById(R.id.login_password)).getText().toString();
                ParseUser.logInInBackground(email, password, new LogInCallback() {
                    @Override
                    public void done(ParseUser user, ParseException e) {
                        if (user != null) {
                            Intent intent = new Intent(v.getContext(), LandingActivity.class);
                            v.getContext().startActivity(intent);
                        } else {
                            Toast.makeText(v.getContext(), "Incorrect email or password", Toast.LENGTH_SHORT).show();
                            ((EditText) findViewById(R.id.login_email)).setText("");
                            ((EditText) findViewById(R.id.login_password)).setText("");
                        }
                    }
                });
            }
        });
        TextView register = (TextView)this.findViewById(R.id.link_to_register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), RegistrationActivity.class);
                v.getContext().startActivity(intent);
            }
        });
        ParseAnalytics.trackAppOpenedInBackground(getIntent());
    }
}
