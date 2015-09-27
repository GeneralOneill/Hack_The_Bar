package google.mapsapi;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

import b2b.classes.User;

public class RegisterCustomer extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_customer);
        Button register = (Button)findViewById(R.id.btnRegister);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                String name = ((EditText) findViewById(R.id.reg_fullname)).getText().toString();
                String email = ((EditText) findViewById(R.id.reg_email)).getText().toString();
                String password = ((EditText) findViewById(R.id.reg_password)).getText().toString();
                User newUser = new User(name, email, password);
                ParseUser user = new ParseUser();
                user.setUsername(email);
                user.setEmail(email);
                user.setPassword(password);
                user.put("Points", 0);
                user.put("FullName", name);
                user.put("Type", "Customer");
                user.signUpInBackground(new SignUpCallback() {
                    @Override
                    public void done(ParseException e) {
                        if (e == null) {
                            Intent intent = new Intent(v.getContext(), LandingActivity.class);
                            v.getContext().startActivity(intent);
                        }
                        else
                            Log.d("Error", e.getMessage().toString());
                    }
                });
            }
        });
    }

}
