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

public class RegisterBar extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_bar);

        Button registerBar = (Button)findViewById(R.id.btn_bar_register);
        registerBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String barName = ((EditText)findViewById(R.id.reg_bar_name)).getText().toString();
                String barEmail = ((EditText)findViewById(R.id.reg_bar_email)).getText().toString();
                String barAddress = ((EditText)findViewById(R.id.reg_bar_address)).getText().toString();
                String barPass = ((EditText)findViewById(R.id.reg_bar_password)).getText().toString();
                ParseObject bar = new ParseObject("Bar");
                bar.put("Name", barName);
                bar.put("Email", barEmail);
                bar.put("Address", barAddress);
                bar.put("Password", barPass);
                bar.saveInBackground();
                Intent intent = new Intent(v.getContext(), LandingActivity.class);
                v.getContext().startActivity(intent);
            }
        });
    }


}
