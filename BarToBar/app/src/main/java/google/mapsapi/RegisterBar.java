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

public class RegisterBar extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_bar);

        Button registerBar = (Button)findViewById(R.id.reg_bar_btn);
        registerBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                String barName = ((EditText)findViewById(R.id.reg_bar_name)).getText().toString();
                String barEmail = ((EditText)findViewById(R.id.reg_bar_email)).getText().toString();
                String barAddress = ((EditText)findViewById(R.id.reg_bar_address)).getText().toString();
                String barPass = ((EditText)findViewById(R.id.reg_bar_password)).getText().toString();
                ParseUser barUser = new ParseUser();
                barUser.setUsername(barEmail);
                barUser.setPassword(barPass);
                barUser.setEmail(barEmail);
                barUser.put("Address", barAddress);
                barUser.put("Type", "Bar");
                barUser.put("BarName", barName);
                barUser.put("Points", 0);
                barUser.signUpInBackground(new SignUpCallback() {
                    @Override
                    public void done(ParseException e) {
                        if (e == null) {
                            IntentHandler.GoToActivity(v, LandingActivity.class);
                        }
                        else {
                            Log.d("Error", e.getMessage());
                        }
                    }
                });

            }
        });
    }


}
