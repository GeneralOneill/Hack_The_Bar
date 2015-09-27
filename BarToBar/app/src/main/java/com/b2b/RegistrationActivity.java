package com.b2b;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.b2b.RegisterBar;
import com.b2b.RegisterCustomer;

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
        Button reg_bar = (Button)findViewById(R.id.bar_reg_btn);
        reg_bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), RegisterBar.class);
                v.getContext().startActivity(intent);
            }
        });
    }
}
