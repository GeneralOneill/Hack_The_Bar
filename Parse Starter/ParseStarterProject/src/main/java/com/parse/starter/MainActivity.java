/*
 * Copyright (c) 2015-present, Parse, LLC.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package com.parse.starter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.parse.ParseAnalytics;


public class MainActivity extends Activity {

  private final String USER_DATA_FILE = "b2b.txt";

  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    TextView register = (TextView)this.findViewById(R.id.link_to_register);
    register.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(v.getContext(), RegistrationActivity.class);
        v.getContext().startActivity(intent);
      }
    });
    ParseAnalytics.trackAppOpenedInBackground(getIntent());
  }

}
