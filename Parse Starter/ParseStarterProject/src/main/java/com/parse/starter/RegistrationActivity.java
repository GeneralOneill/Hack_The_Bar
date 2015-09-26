package com.parse.starter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegistrationActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        Button reg_customer = (Button)findViewById(R.id.customer_reg_btn);
        reg_customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), RegisterCustomer.class);
                v.getContext().startActivity(intent);
            }
        });

    }
    public void RegisterCustomer(View view){
        Intent intent = new Intent(this, RegisterCustomer.class);
    }


}
