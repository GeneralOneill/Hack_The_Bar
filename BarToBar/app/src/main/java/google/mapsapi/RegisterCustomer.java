package google.mapsapi;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.parse.ParseObject;

import b2b.classes.User;

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
                String name = ((EditText) findViewById(R.id.reg_fullname)).getText().toString();
                String email = ((EditText) findViewById(R.id.reg_email)).getText().toString();
                String password = ((EditText) findViewById(R.id.reg_password)).getText().toString();
                User newUser = new User(name, email, password);
                ParseObject user = new ParseObject("User");
                user.put("Name", name);
                user.put("Email", email);
                user.put("Password", password);
                user.saveInBackground();
                v.getContext().startActivity(intent);
            }
        });
    }

}
