package google.mapsapi;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.parse.ParseAnalytics;
import com.parse.ParseObject;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView register = (TextView)this.findViewById(R.id.link_to_register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), RegistrationActivity.class);
                v.getContext().startActivity(intent);
            }
        });
        ParseAnalytics.trackAppOpenedInBackground(getIntent());
        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo","bar");
        testObject.saveInBackground();
        System.out.println("Run");
    }
}
