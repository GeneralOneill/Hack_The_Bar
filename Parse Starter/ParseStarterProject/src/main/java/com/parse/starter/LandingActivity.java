package com.parse.starter;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LandingActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        String [] values = new String[]{"User Profile", "History", "Coupon Page"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
            R.layout.row_layout, R.id.label, values);
        setListAdapter(adapter);
    }

    protected void onListItem(ListView l, View v, int position, long id){
        System.out.println((String)getListAdapter().getItem(position));
    }

}
