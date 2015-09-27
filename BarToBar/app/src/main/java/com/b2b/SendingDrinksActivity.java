package com.b2b;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.b2b.HistoryActivity;
import com.b2b.IntentHandler;
import com.parse.ParseObject;
import com.parse.ParseQuery;

public class SendingDrinksActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sending_drinks);
        Button sellDrink = (Button)findViewById(R.id.sell_drink_sd);
        sellDrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                final String drinkName = ((EditText)findViewById(R.id.drink_name_sd)).getText().toString();
                final String barEmail = ((EditText)findViewById(R.id.bar_email_sd)).getText().toString();
                final String bartender = ((EditText)findViewById(R.id.bartender_sd)).getText().toString();
                final String customer = ((EditText)findViewById(R.id.cust_email_sd)).getText().toString();
                ParseQuery<ParseObject> query = ParseQuery.getQuery("Drink");
                query.whereEqualTo("Name", drinkName);
                query.whereEqualTo("BarEmail", barEmail);
                IntentHandler.GoToActivity(v, HistoryActivity.class);
                /*query.getFirstInBackground(new GetCallback<ParseObject>() {
                    @Override
                    public void done(ParseObject object, ParseException e) {
                        System.out.println("Entered");
                        if (e ==null){
                            if (object == null) {
                                Log.d("Drink", "Drinks not found");
                                Intent intent = new Intent(v.getContext(), CreateDrinksActivity.class);
                                v.getContext().startActivity(intent);
                            } else {
                                Log.d("Drink", "Drink found");
                                ParseObject interaction = new ParseObject("Interaction");
                                interaction.put("DrinkName", drinkName);
                                interaction.put("BarEmail", barEmail);
                                interaction.put("CustomerEmail", customer);
                                interaction.put("Bartender", bartender);
                                interaction.saveInBackground();
                                final String BAR_EMAIL = barEmail;
                                final String DRINK_NAME= drinkName;
                                ParseQuery<ParseUser> query = ParseUser.getQuery();
                                query.whereEqualTo("email", customer);
                                query.getFirstInBackground(new GetCallback<ParseUser>() {
                                    @Override
                                    public void done(ParseUser parseUser, ParseException e) {
                                        if (e == null) if (parseUser != null) {
                                            final ParseUser user = parseUser;
                                            ParseQuery<ParseObject> query = ParseQuery.getQuery("Drink");
                                            query.whereEqualTo("BarEmail", BAR_EMAIL);
                                            query.whereEqualTo("Name", DRINK_NAME);
                                            query.getFirstInBackground(new GetCallback<ParseObject>() {
                                                @Override
                                                public void done(ParseObject object, ParseException e) {
                                                    int points = (Integer) user.get("Points");
                                                    points += Float.parseFloat((String) object.get("Price"));
                                                    user.put("Points", points);
                                                    user.saveInBackground();
                                                }
                                            });
                                        }
                                        else {
                                            Log.d("Error", e.getMessage());
                                        }
                                    }
                                });
                            }

                        }
                        else {
                            Log.d("Error", e.getMessage());
                        }
                    }
                });*/

            }
        });
    }
}
