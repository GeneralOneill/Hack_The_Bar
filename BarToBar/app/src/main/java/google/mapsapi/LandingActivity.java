package google.mapsapi;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.parse.ParseUser;

public class LandingActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_landing);
        ParseUser currentUser = ParseUser.getCurrentUser();
        String [] values;
        if (currentUser!=null) {
            if (currentUser.get("Type").equals("Customer")) {
                values = new String[]{"User Profile", "History", "Coupon Page", "Map Location", "Log Out"};
            }
            else if (currentUser.get("Type").equals("Bar")) {
                values=new String[]{"Bar Profile", "History", "Log out"};
            }
            else {
                values = new String[0];
                Intent intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
            }
        }
        else {
            values = new String[0];
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        }
        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(this,
                R.layout.row_layout, R.id.label, values);
        ListView listView= (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, final View view, int position, long id) {
                System.out.println(position);
                String item = (String)parent.getAdapter().getItem(position);
                System.out.println(item);
                if (item.equals("Log Out")) {
                    ParseUser.logOut();
                    Intent intent = new Intent(view.getContext(), LoginActivity.class);
                    startActivity(intent);
                }
                if (item.equals("User Profile")) {
                    Intent intent= new Intent(view.getContext(), UserProfileActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

}
