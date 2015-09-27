package google.mapsapi;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.parse.ParseUser;

public class UserProfileActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
        TextView userEmail = (TextView)findViewById(R.id.user_profile_email);
        ParseUser currentUser = ParseUser.getCurrentUser();
        if(currentUser!=null)
            userEmail.setText(currentUser.getEmail());
        else{
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        }
    }
}
