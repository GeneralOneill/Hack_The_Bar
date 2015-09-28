package com.b2b;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.parse.ParseObject;

public class DrinkListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_drinks);
        Button makeDrink = (Button)findViewById(R.id.make_drink_cd);
        makeDrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String drinkName = ((EditText) findViewById(R.id.drink_name_cd)).getText().toString();
                String barEmail = ((EditText) findViewById(R.id.bar_email_cd)).getText().toString();
                String price = ((EditText) findViewById(R.id.drink_price_cd)).getText().toString();
                ParseObject drink = new ParseObject("Drink");
                drink.put("Name", drinkName);
                drink.put("BarEmail", barEmail);
                drink.put("Price", Integer.parseInt(price));
                drink.saveInBackground();
                IntentHandler.GoToActivity(v, SendingDrinksActivity.class);
            }
        });
    }
}
