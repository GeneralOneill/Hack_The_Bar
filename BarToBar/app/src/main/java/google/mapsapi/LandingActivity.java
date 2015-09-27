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
<<<<<<< HEAD
        if(currentUser!=null){
            if(currentUser.get("Type").equals("Customer")){
                values = new String[]{"User Profile", "History", "Map Location", "Log Out"};
            }
            else if(currentUser.get("Type").equals("Bar")){
                values=new String[]{"Bar Profile", "History","Sell Drink", "Create Drink", "List Drinks", "Log out"};
=======
        if (currentUser!=null) {
            if (currentUser.get("Type").equals("Customer")) {
                values = new String[]{"User Profile", "History", "Coupon Page", "Map Location", "Log Out"};
            }
            else if (currentUser.get("Type").equals("Bar")) {
                values=new String[]{"Bar Profile", "History", "Log out"};
>>>>>>> aee5f4a77b408a245dcb121ecc0282e9fa379e87
            }
            else {
                values = new String[0];
                Intent intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
            }
        }
        else {
            values = new String[0];
            IntentHandler.GoToActivity(this, LoginActivity.class);
        }
        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(this,
                R.layout.row_layout, R.id.label, values);
        ListView listView= (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, final View view, int position, long id) {
<<<<<<< HEAD
                System.out.println(position);
                String item = (String) parent.getAdapter().getItem(position);
=======
                String item = (String)parent.getAdapter().getItem(position);
<<<<<<< HEAD
                if (item.equals("Log Out")){
=======
>>>>>>> d972fc16fc270cb7db76f92592a58043d6c404ea
                System.out.println(item);
                if (item.equals("Log Out")) {
>>>>>>> aee5f4a77b408a245dcb121ecc0282e9fa379e87
                    ParseUser.logOut();
                    IntentHandler.GoToActivity(view, LoginActivity.class);
                }
<<<<<<< HEAD
                if(item.equals("User Profile")){
                    IntentHandler.GoToActivity(view, UserProfileActivity.class);
                }
                if(item.equals("Map Location")){
                    IntentHandler.GoToActivity(view, WebMapsActivity.class);
                }
                switch(item){
                    case "Log Out": ParseUser.logOut();
                        IntentHandler.GoToActivity(view, LoginActivity.class);
                        break;
                    case "User Profile": IntentHandler.GoToActivity(view, UserProfileActivity.class);
                        break;
                    case "Map Location":
                        IntentHandler.GoToActivity(view, WebMapsActivity.class);
                        break;
                    case "Sell Drink":
                        IntentHandler.GoToActivity(view, SendingDrinksActivity.class);
                        break;
                    case "Create Drink":
                        IntentHandler.GoToActivity(view, CreateDrinksActivity.class);
                        break;
                    case "List Drinks":
                        IntentHandler.GoToActivity(view, DrinkListActivity.class);
                        break;
                    case "History":
                        IntentHandler.GoToActivity(view, HistoryActivity.class);
                        break;
                    default:
                        break;
=======
                if (item.equals("User Profile")) {
                    Intent intent = new Intent(view.getContext(), UserProfileActivity.class);
                    startActivity(intent);
>>>>>>> aee5f4a77b408a245dcb121ecc0282e9fa379e87
                }

            }
        });
    }

}


